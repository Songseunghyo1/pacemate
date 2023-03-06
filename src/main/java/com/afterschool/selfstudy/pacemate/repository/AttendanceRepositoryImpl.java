package com.afterschool.selfstudy.pacemate.repository;

import com.afterschool.selfstudy.pacemate.domain.dto.StudentAttendanceCheckReq;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AttendanceRepositoryImpl implements StudentAttendanceRepository {

    private final JPAQueryFactory query;

    @Override
    public Long instStudentAttendance(StudentAttendanceCheckReq req) {
        return null;
    }
}
