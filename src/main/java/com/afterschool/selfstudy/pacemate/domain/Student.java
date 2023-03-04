package com.afterschool.selfstudy.pacemate.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "STUDENT")
public class Student {

    @GeneratedValue
    @Id
    private Long id;

    private String name;

    @Column(name = "STUDENT_NUM")
    private Long num;

    private Long classroom;

    private Long seatNo;

    private String fireYn;
}
