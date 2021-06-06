package com.pacemate.demo.service;

import com.pacemate.demo.domain.Student;

import java.util.List;

public interface StudentSearchService {

    void insertStudentInfo();

    void insertStudent(Integer grade, Integer classRoom, Integer num, String name, Integer seatNum, String outYn);

    List<Student> retrieveAllStudent();

    List<Student> retrieveStudentByStudentInfo(Integer grade, Integer classRoom, Integer num, String name);
}
