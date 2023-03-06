package com.afterschool.selfstudy.pacemate.domain.dto;

import com.afterschool.selfstudy.pacemate.domain.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentAttendanceCheckReq {

    private Long studentId;
    private String isAttended;
    private LocalDateTime checkDate;

    private Student student;
}
