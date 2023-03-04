package com.afterschool.selfstudy.pacemate.domain;

import javax.persistence.*;

@Entity
@Table(name = "NO_APPEARANCE_DAY")
public class NoAppearanceDay {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NO_ATTEND_DAY")
    private String day;

    @ManyToOne
    private Student student;
}
