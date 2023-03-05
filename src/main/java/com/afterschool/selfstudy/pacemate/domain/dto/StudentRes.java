package com.afterschool.selfstudy.pacemate.domain.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentRes {
    private Long id;
    private Long grade;
    private Long classNo;
    private Long studentNum;
    private String name;
    private Long seatNo;
    private boolean isFired;
}
