package com.afterschool.selfstudy.pacemate.repository;

import com.afterschool.selfstudy.pacemate.domain.dto.StudentAttendanceCheckReq;

public interface StudentAttendanceRepository {

    Long instStudentAttendance(StudentAttendanceCheckReq req);
}
