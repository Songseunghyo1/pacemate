package com.afterschool.selfstudy.pacemate.domain.dto;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentReq {

    private String name;
    private Long grade;
    private Long classNo;
    private Long studentNum;
    private Long seatNo;
    private Boolean isFired;

}
