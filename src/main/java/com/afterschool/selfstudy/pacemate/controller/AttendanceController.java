package com.afterschool.selfstudy.pacemate.controller;

import com.afterschool.selfstudy.pacemate.domain.Attendance;
import com.afterschool.selfstudy.pacemate.domain.dto.StudentAttendanceCheckReq;
import com.afterschool.selfstudy.pacemate.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AttendanceController {

    @Autowired
    private AttendanceService attendanceService;

    @PostMapping("/check/student/attendance")
    public ResponseEntity<Attendance> checkStdentAttendance(@RequestBody StudentAttendanceCheckReq attendanceCheckReq) {

        return ResponseEntity.ok(attendanceService.checkAttendance(attendanceCheckReq));
    }

    // TODO 출석부 출력 - 엑셀로 내려받기
}
