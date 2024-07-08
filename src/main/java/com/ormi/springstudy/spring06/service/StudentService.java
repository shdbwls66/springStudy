package com.ormi.springstudy.spring06.service;

import com.ormi.springstudy.spring06.domain.Student;
import com.ormi.springstudy.spring06.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

//@Service
public class StudentService {
    //    @Autowired
//    @Qualifier("studentNamedParameterJdbcRepository")
//    private StudentRepository studentRepository;

//    @Autowired
    @Qualifier("studentJdbcTemplateRepository")
    private StudentRepository studentRepository;

    public List<String> getListOfStudentName() {
        return studentRepository.selectListOfStudentName();
    }

    public void registStudent(Student student) {
        studentRepository.insertStudent(student);
    }

    public List<Student> getListOfStudent() {
        return studentRepository.findAll();
    }

}
