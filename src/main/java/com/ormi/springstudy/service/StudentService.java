package com.ormi.springstudy.service;

import com.ormi.springstudy.domain.Student;
import com.ormi.springstudy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import java.util.Map;

import java.util.List;

@Service
public class StudentService {
    //    @Autowired
//    @Qualifier("studentNamedParameterJdbcRepository")
//    private StudentRepository studentRepository;

    @Autowired
    @Qualifier("studentJdbcTemplateRepository")
    private StudentRepository studentRepository;

    public List<String> getListOfStudentName() {
        return studentRepository.selectListOfStudentName();
    }

    public void registStudent(Map<String, Object> params) {
        studentRepository.insertStudent(params);
    }

    public void registStudent(Student student) {
        studentRepository.insertStudent(student);
    }

    public List<Student> getListOfStudent() {
        return studentRepository.findAll();
    }

}
