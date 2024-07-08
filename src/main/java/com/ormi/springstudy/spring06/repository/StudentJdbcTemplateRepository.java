package com.ormi.springstudy.spring06.repository;

import com.ormi.springstudy.spring06.domain.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

//@Repository
public class StudentJdbcTemplateRepository implements StudentRepository {
    private final JdbcTemplate jdbcTemplate;

    public StudentJdbcTemplateRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<String> selectListOfStudentName() {
        return jdbcTemplate.query("select name from students", (rs, rowNum) -> rs.getString("name"));
    }

    @Override
    public List<Student> findAll() {
        return jdbcTemplate.query("select * from students", (rs, rowNum) ->
                new Student(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("address")));
    }

    @Override
    public int insertStudent(Student student) {
        return jdbcTemplate.update("insert into students (name, age, address) values (?, ?, ?)",
                student.getName(), student.getAge(), student.getAddress());

    }


}
