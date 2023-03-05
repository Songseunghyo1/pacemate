package com.afterschool.selfstudy.pacemate.repository;

import com.afterschool.selfstudy.pacemate.domain.Student;
import com.afterschool.selfstudy.pacemate.domain.dto.StudentReq;
import com.afterschool.selfstudy.pacemate.domain.dto.StudentRes;

import java.util.List;

public interface StudentSearchRepository {

    List<Student> findStudentByStudentReq(StudentReq studentReq);
}
