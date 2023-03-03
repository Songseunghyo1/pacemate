package com.afterschool.selfstudy.pacemate.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
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
