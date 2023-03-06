package com.afterschool.selfstudy.pacemate.repository;

import com.afterschool.selfstudy.pacemate.domain.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttendanceRepository extends JpaRepository<Attendance, Long>, StudentAttendanceRepository {
}
