package com.afterschool.selfstudy.pacemate.service;

import com.afterschool.selfstudy.pacemate.domain.Attendance;
import com.afterschool.selfstudy.pacemate.domain.Student;
import com.afterschool.selfstudy.pacemate.domain.dto.StudentAttendanceCheckReq;
import com.afterschool.selfstudy.pacemate.repository.AttendanceRepository;
import com.afterschool.selfstudy.pacemate.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class AttendanceService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private AttendanceRepository attendanceRepository;

    public Attendance checkAttendance(StudentAttendanceCheckReq attendanceCheckReq) {
        Optional<Student> optionalStudent = Optional.ofNullable(studentRepository.findById(attendanceCheckReq.getStudentId())
                .orElseThrow(RuntimeException::new));

        Student student = optionalStudent.get();
        LocalDateTime now = LocalDateTime.now();

        Attendance attendance = new Attendance();
        attendance.setAttentYn(attendanceCheckReq.getIsAttended());
        attendance.setCheckDate(now);
        attendance.setStudent(student);

        return attendanceRepository.save(attendance);
    }
}
