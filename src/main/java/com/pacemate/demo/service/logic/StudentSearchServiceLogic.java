package com.pacemate.demo.service.logic;

import com.pacemate.demo.dao.StudentMapper;
import com.pacemate.demo.domain.Student;
import com.pacemate.demo.service.StudentSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentSearchServiceLogic implements StudentSearchService {

    @Autowired
    private StudentMapper mapper;


    @Override
    public List<Student> retrieveAllStudent() {
        return mapper.retrieveAllStudent();
    }
}
