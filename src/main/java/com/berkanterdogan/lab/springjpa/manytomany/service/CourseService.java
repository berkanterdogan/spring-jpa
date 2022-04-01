package com.berkanterdogan.lab.springjpa.manytomany.service;

import com.berkanterdogan.lab.springjpa.manytomany.domain.Course;

import java.util.List;

public interface CourseService {

    void deleteAll();

    Course save(Course course);

    List<Course> findAll();
}
