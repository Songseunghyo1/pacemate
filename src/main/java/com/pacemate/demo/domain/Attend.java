package com.pacemate.demo.domain;

import lombok.Data;

@Data
public class Attend {
    private int seq;
    private int grade;
    private int classRoom;
    private int name;
    private boolean isAttend;
    private String checkedDate;
}
