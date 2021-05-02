package com.pacemate.demo.util;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.pacemate.demo.domain.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVFileReader {

    private File file;

    private final Logger logger = LoggerFactory.getLogger(CSVFileReader.class);

    public CSVFileReader(File file) {
        this.file = file;
    }

    public List<Student> getStudentInfoList() {
        List<Student> studentList = new ArrayList<>();
        List<String[]> studentRowList = new ArrayList<String[]>();

        try {
            CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String[] studentRow;

            while ((studentRow = reader.readNext()) != null) {
                studentRowList.add(studentRow);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }

        return makeStudentListFromArr(studentRowList);
    }

    public void readCSVFromStudentList() {
        List<Student> studentList = new ArrayList<>();
        List<String[]> studentRowList = new ArrayList<String[]>();

        try {
            CSVReader reader = new CSVReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
            String[] studentRow;

            while ((studentRow = reader.readNext()) != null) {
                studentRowList.add(studentRow);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }

        studentList = makeStudentListFromArr(studentRowList);
        for (Student student : studentList) {
            logger.info(String.valueOf(student.getGrade()));
            logger.info(String.valueOf(student.getClassRoom()));
            logger.info(String.valueOf(student.getNum()));
            logger.info(student.getName());
            logger.info(String.valueOf(student.getSeatNum()));
            logger.info(String.valueOf(student.getOutYn()));
        }
    }

    private List<Student> makeStudentListFromArr(List<String[]> studentRowList) {
        List<Student> studentList = new ArrayList<>();

        int rowCnt = 0;
        for (String[] studentRow : studentRowList) {
            rowCnt += 1;

            if (rowCnt == 1) {
                continue;
            }

            Student student = getStudentInfoFromStudentRow(studentRow);
            studentList.add(student);
        }

        return studentList;
    }

    private Student getStudentInfoFromStudentRow(String[] studentRow) {
        Student student = new Student();
        // 0: 학년 1: 반 2: 번호 3: 이름 4: 좌석번호, 5: 퇴출여부
        student.setGrade(Integer.parseInt(studentRow[0]));
        student.setClassRoom(Integer.parseInt(studentRow[1]));
        student.setNum(Integer.parseInt(studentRow[2]));
        student.setName(studentRow[3]);
        student.setSeatNum(Integer.parseInt(studentRow[4]));
        student.setOutYn(studentRow[5]);

        logger.info(studentRow[0]);
        logger.info(studentRow[1]);
        logger.info(studentRow[2]);
        logger.info(studentRow[3]);
        logger.info(studentRow[4]);
        logger.info(studentRow[5]);

        return student;
    }
}
