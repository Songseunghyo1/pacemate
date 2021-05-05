package com.pacemate.demo.service;

import com.pacemate.demo.domain.Student;

import java.util.List;

public interface StudentSearchService {

    void insertStudentInfo();

    List<Student> retrieveAllStudent();

    List<Student> retrieveStudentByStudentInfo(Integer grade, Integer classRoom, Integer num, String name, String outYn);
}
