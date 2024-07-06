package com.ormi.springstudy.repository;

import com.ormi.springstudy.domain.Student;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface StudentRepository {
    List<Student> findAll();
    List<String> selectListOfStudentName();
    int insertStudent(Student student);
}
