package com.pacemate.demo.domain;

import lombok.Data;

@Data
public class Student {
    private String uuid;
    private int grade;
    private int classRoom;
    private int num;
    private String name;
    private int seatNum;
    private boolean isOut;
}
