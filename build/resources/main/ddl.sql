CREATE DATABASE PACE_MATE;

CREATE TABLE STUDENT(
    GRADE INT(4) NOT NULL ,
    CLASS_ROOM INT(4) NOT NULL,
    NUM INT(4) NOT NULL,
    NAME VARCHAR(50) NOT NULL,
    SEAT_NUM INT(4) NOT NULL,
    IS_OUT INT(1) NOT NULL,

    PRIMARY KEY(GRADE, CLASS_ROOM, NUM)

) DEFAULT CHARSET=UTF8 COLLATE=UTF8_GENERAL_CI;

CREATE TABLE NO_SHOW_DAY(
    SEQ INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
    NO_SHOW_DAY VARCHAR(2) NOT NULL,
    GRADE INT(4) NOT NULL,
    CLASS_ROOM INT(4) NOT NULL,
    NUM INT(4) NOT NULL,
    NAME VARCHAR(50) NOT NULL,

    FOREIGN KEY (GRADE, CLASS_ROOM, NUM) REFERENCES STUDENT (GRADE, CLASS_ROOM, NUM)
) DEFAULT CHARSET=UTF8 COLLATE=UTF8_GENERAL_CI;

CREATE TABLE ATTEND(
   SEQ INT(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
   GRADE INT(4) NOT NULL,
   CLASS_ROOM INT(4) NOT NULL,
   NUM INT(4) NOT NULL,
   NAME VARCHAR(50) NOT NULL,
   ATTEND_YN CHAR(1) NOT NULL,
   TODAY CHAR(8) NOT NULL,

   FOREIGN KEY (GRADE, CLASS_ROOM, NUM) REFERENCES STUDENT (GRADE, CLASS_ROOM, NUM)
) DEFAULT CHARSET=UTF8 COLLATE=UTF8_GENERAL_CI;