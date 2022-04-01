package com.berkanterdogan.lab.springjpa.manytomany.service;

import com.berkanterdogan.lab.springjpa.manytomany.domain.Student;

import java.util.List;

public interface StudentService {

    void deleteAll();

    Student save(Student student);

    List<Student> findAll();
}
