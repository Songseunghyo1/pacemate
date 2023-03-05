package com.afterschool.selfstudy.pacemate.repository;

import com.afterschool.selfstudy.pacemate.domain.Student;
import com.afterschool.selfstudy.pacemate.domain.dto.StudentReq;
import com.afterschool.selfstudy.pacemate.domain.dto.StudentRes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long>, StudentSearchRepository {

}
