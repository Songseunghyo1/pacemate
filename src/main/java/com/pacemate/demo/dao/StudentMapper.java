package com.pacemate.demo.dao;

import com.pacemate.demo.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> retrieveAllStudent();
}
