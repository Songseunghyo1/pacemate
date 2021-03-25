package com.pacemate.demo.controller;

import com.pacemate.demo.domain.Student;
import com.pacemate.demo.service.StudentSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class HelloController {

    @Autowired
    private StudentSearchService studentSearchService;

    @GetMapping
    public List<Student> hello() {
        return studentSearchService.retrieveAllStudent();
    }
}
