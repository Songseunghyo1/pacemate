package com.afterschool.selfstudy.pacemate.repository;

import com.afterschool.selfstudy.pacemate.domain.QStudent;
import com.afterschool.selfstudy.pacemate.domain.Student;
import com.afterschool.selfstudy.pacemate.domain.dto.StudentReq;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class StudentRepositoryImpl implements StudentSearchRepository {

    private final JPAQueryFactory query;

    @Override
    public List<Student> findStudentByStudentReq(StudentReq studentReq) {

        BooleanBuilder builder = new BooleanBuilder();

        if (studentReq.getClassNo() != null) {
            if (studentReq.getClassNo() != 0) {
                builder.and(QStudent.student.classroom.eq(studentReq.getClassNo()));
            }
        }

        if (studentReq.getStudentNum() != null) {
            if (studentReq.getStudentNum() != 0) {
                builder.and(QStudent.student.num.eq(studentReq.getStudentNum()));
            }
        }

        if (studentReq.getGrade() != null) {
            if (studentReq.getGrade() != 0) {
                builder.and(QStudent.student.grade.eq(studentReq.getGrade()));
            }
        }

        if (studentReq.getName() != null) {
            builder.and(QStudent.student.name.eq(studentReq.getName()));
        }

        if (studentReq.getSeatNo() != null) {
            if (studentReq.getSeatNo() != 0) {
                builder.and(QStudent.student.seatNo.eq(studentReq.getSeatNo()));
            }
        }

        String firedYn = "";
        if (studentReq.getIsFired() != null) {
            firedYn = studentReq.getIsFired() ? "Y" : "N";
            builder.and(QStudent.student.fireYn.eq(firedYn));
        }

        return query.selectFrom(QStudent.student)
                .where(builder)
                .fetch();
    }


}
