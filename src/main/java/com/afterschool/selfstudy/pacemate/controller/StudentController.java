package com.afterschool.selfstudy.pacemate.controller;

import com.afterschool.selfstudy.pacemate.domain.Student;
import com.afterschool.selfstudy.pacemate.domain.dto.StudentReq;
import com.afterschool.selfstudy.pacemate.domain.dto.StudentRes;
import com.afterschool.selfstudy.pacemate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /**
     * 학생 단건 등록
     *
     * @param studentReq
     * */
    @PostMapping("/add/newStudent")
    public ResponseEntity<Student> addNewStudent(@RequestBody StudentReq studentReq) {

        return ResponseEntity.ok(studentService.addNewStudent(studentReq));
    }

    /**
     * 학생목록 조회
     *
     * @param studentReq
     * */
    @PostMapping("/retrieve/student")
    public ResponseEntity<List<Student>> retrieveStudentList(@RequestBody StudentReq studentReq,
                                                                HttpServletRequest request, HttpServletResponse response) {

        return ResponseEntity.ok(studentService.findStudentByCondition(studentReq));
    }

    @GetMapping("/all/student")
    public ResponseEntity<List<StudentRes>> retrieveAllStudent() {
        return ResponseEntity.ok(studentService.getAllStudents());
    }
}
