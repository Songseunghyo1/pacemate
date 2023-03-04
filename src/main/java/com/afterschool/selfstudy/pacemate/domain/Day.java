package com.afterschool.selfstudy.pacemate.domain;

public enum Day {
    MON("DAY01", "MONDAY"),
    TUE("DAY02", "TUESDAYU"),
    WED("DAY03", "WEDNESDAY"),
    THU("DAY04", "THURSDAY"),
    FRI("DAY05", "FRIDAY"),
    SAT("DAY06", "SATURDAY"),
    SUN("DAY07", "SUNDAY")
    ;

    private final String code;
    private final String name;

    Day(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
