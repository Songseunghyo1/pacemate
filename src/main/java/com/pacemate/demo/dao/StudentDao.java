package com.pacemate.demo.dao;

import com.pacemate.demo.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface StudentDao {

    void insertStudentInfo(@Param("grade") int grade,
                           @Param("classRoom") int classRoom,
                           @Param("num") int num,
                           @Param("name") String name,
                           @Param("seatNum") int seatNum,
                           @Param("outYn") String outYn);

    List<Student> retrieveAllStudent();
}
