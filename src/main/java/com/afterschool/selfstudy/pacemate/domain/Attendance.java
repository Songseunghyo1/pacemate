package com.afterschool.selfstudy.pacemate.domain;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "ATTENDANCE")
public class Attendance {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime checkDate;

    private String attentYn;

    @ManyToOne
    private Student student;
}
