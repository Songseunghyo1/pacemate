package com.pacemate.demo.resource;

import com.pacemate.demo.domain.Student;
import com.pacemate.demo.service.StudentSearchService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class StudentResource {

    @Autowired
    private StudentSearchService studentSearchService;

    private final Logger logger = LoggerFactory.getLogger(StudentResource.class);

    @PostMapping("/inject/studentinfo")
    public void injectStudentInfo() {
        studentSearchService.insertStudentInfo();
    }

    @PostMapping("/inject/student")
    public void injectStudent(@RequestParam(value = "grade", required = false) Integer grade,
                              @RequestParam(value = "classRoom", required = false) Integer classRoom,
                              @RequestParam(value = "num", required = false) Integer num,
                              @RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "seatNum", required = false) Integer seatNum,
                              @RequestParam(value = "outYn", required = false) String outYn) {
        studentSearchService.insertStudent(grade, classRoom, num, name, seatNum, outYn);
    }

    @GetMapping("/retrieve/all/student")
    public List<Student> retrieveAllStudentList() {
        return studentSearchService.retrieveAllStudent();
    }

    /*@GetMapping("/retrieve/student/")
    public List<Student> retrieveStudentByCondition(@RequestParam(value = "grade", required = false) Integer grade,
                                                    @RequestParam(value = "classRoom", required = false) Integer classRoom,
                                                    @RequestParam(value = "num", required = false) Integer num,
                                                    @RequestParam(value = "name", required = false) String name,
                                                    @RequestParam(value = "outYn", required = false) String outYn) {

        return studentSearchService.retrieveStudentByStudentInfo(grade, classRoom, num, name, outYn);
    }*/

    /*@GetMapping("/retrieve/student")
    public List<Student> retrieveStudentByCondition(@RequestParam(value = "grade") Integer grade,
                                                    @RequestParam(value = "classRoom") Integer classRoom,
                                                    @RequestParam(value = "num") Integer num,
                                                    @RequestParam(value = "name") String name,
                                                    @RequestParam(value = "outYn") String outYn) {

        return studentSearchService.retrieveStudentByStudentInfo(grade, classRoom, num, name, outYn);
    }*/

    @GetMapping("/retrieve/student")
    public List<Student> retrieveStudentByCondition(HttpServletRequest req) {
        String gradeStr = req.getParameter("grade");
        String classRoomStr = req.getParameter("classRoom");
        String numStr = req.getParameter("num");
        String name = req.getParameter("name");

        Integer grade = gradeStr == null ? null : Integer.parseInt(gradeStr);
        Integer classRoom = classRoomStr == null ? null : Integer.parseInt(classRoomStr);
        logger.info(String.valueOf(classRoom));
        Integer num = numStr == null ? null : Integer.parseInt(numStr);

        return studentSearchService.retrieveStudentByStudentInfo(grade, classRoom, num, name);
    }
}
