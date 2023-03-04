package com.afterschool.selfstudy.pacemate.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

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
