package com.pacemate.demo.resource;

import com.pacemate.demo.domain.Student;
import com.pacemate.demo.service.StudentSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentResource {

    @Autowired
    private StudentSearchService studentSearchService;

    @PostMapping("/inject/studentinfo")
    public void injectStudentInfo() {
        studentSearchService.insertStudentInfo();
    }

    @GetMapping("/retrieve/all/student")
    public List<Student> retrieveAllStudentList() {
        return studentSearchService.retrieveAllStudent();
    }
}
