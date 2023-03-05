package com.afterschool.selfstudy.pacemate.service;

import com.afterschool.selfstudy.pacemate.domain.Student;
import com.afterschool.selfstudy.pacemate.domain.dto.StudentReq;
import com.afterschool.selfstudy.pacemate.domain.dto.StudentRes;
import com.afterschool.selfstudy.pacemate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student addNewStudent(StudentReq studentReq) {
        Student student = new Student();
        student.setName(studentReq.getName());
        student.setGrade(studentReq.getGrade());
        student.setClassroom(studentReq.getClassNo());
        student.setFireYn(studentReq.isFired() == true ? "Y" : "N");
        student.setSeatNo(studentReq.getSeatNo());
        student.setNum(studentReq.getStudentNum());

        return studentRepository.save(student);
    }

    public List<Student> findStudentByCondition(StudentReq req) {
        return studentRepository.findStudentByStudentReq(req);
    }

    public List<StudentRes> getAllStudents() {
        List<Student> students = studentRepository.findAll();

        List<StudentRes> allStudentList = new ArrayList<>();
        students.forEach(o -> {
            StudentRes res = StudentRes.builder()
                    .id(o.getId())
                    .classNo(o.getClassroom())
                    .isFired(o.getFireYn() == "Y" ? true : false)
                    .name(o.getName())
                    .studentNum(o.getNum())
                    .seatNo(o.getSeatNo())
                    .build();

            allStudentList.add(res);
        });

        return allStudentList;
    }
}
