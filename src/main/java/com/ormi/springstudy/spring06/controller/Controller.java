package com.ormi.springstudy.spring06.controller;

import com.ormi.springstudy.spring06.domain.Student;
import com.ormi.springstudy.spring06.service.StudentService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//@RestController
public class Controller {

    private final StudentService studentService;

    public Controller(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/hello")
    public String hi() {
        return "OK";
    }

    @GetMapping("/student/name/list")
    public List<String> getListOfStudentName() {
        return studentService.getListOfStudentName();
    }

    @GetMapping("/student/list")
    public List<Student> getListOfStudent() {
        return studentService.getListOfStudent();
    }
    @PostMapping("/student/regist2")
    public void registStudent(@RequestParam Student student) {
        studentService.registStudent(student);
    }

    /**
     * curl -X PUT "http://localhost:8080/student/regist" -d '{ "name":"김영수", "age":"28"}'
     */

}
