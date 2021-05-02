package com.pacemate.demo.service.logic;

import com.pacemate.demo.dao.StudentDao;
import com.pacemate.demo.domain.Student;
import com.pacemate.demo.service.StudentSearchService;
import com.pacemate.demo.util.CSVFileReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentSearchServiceLogic implements StudentSearchService {

    @Autowired
    private StudentDao studentDao;

    private final Logger logger = LoggerFactory.getLogger(StudentSearchServiceLogic.class);

    @Override
    public void insertStudentInfo() {
        List<Student> studentInfoList = new ArrayList<>();
        String filePath = "D:\\csv\\20210327.csv.csv";

        try {
            URI uri = uri = new URI("file:///D:/csv/20210502.csv");
            File file = new File(uri);
            CSVFileReader csvFileReader = new CSVFileReader(file);
            studentInfoList = csvFileReader.getStudentInfoList();

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

        for (Student student : studentInfoList) {
            int grade = student.getGrade();
            int classRoom = student.getClassRoom();
            int num = student.getNum();
            String name = student.getName();
            int seatNum = student.getSeatNum();
            String outYn = student.getOutYn();

            studentDao.insertStudentInfo(grade, classRoom, num, name, seatNum, outYn);
        }

    }

    @Override
    public List<Student> retrieveAllStudent() {
        List<Student> studentList = studentDao.retrieveAllStudent();

        for (Student student : studentList) {
            logger.info(student.getName());
            logger.info(student.getOutYn());
        }

        return studentDao.retrieveAllStudent();
    }
}
