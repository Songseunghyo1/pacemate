package com.pacemate.demo.controller;

import com.pacemate.demo.service.StudentSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PaceMateController {

    @RequestMapping(value = "/pacemate")
    public String index() {
        return "index.html";
    }

    @RequestMapping(value = "/retrievestudent")
    public String retrieveStudent() {
        return "retrieve-student.html";
    }

    @RequestMapping(value = "/fileupload")
    public String fileUpload() {
        return "file-upload.html";
    }

    @RequestMapping(value = "/manageattendance")
    public String manageAttendance() {
        return "manage-attendance.html";
    }
}
