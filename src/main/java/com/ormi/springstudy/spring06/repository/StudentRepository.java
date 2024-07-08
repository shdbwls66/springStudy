package com.ormi.springstudy.spring06.repository;

import com.ormi.springstudy.spring06.domain.Student;
import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    List<String> selectListOfStudentName();
    int insertStudent(Student student);
}
