package com.berkanterdogan.lab.springjpa.manytomany.service.impl;

import com.berkanterdogan.lab.springjpa.manytomany.domain.Course;
import com.berkanterdogan.lab.springjpa.manytomany.repository.CourseRepository;
import com.berkanterdogan.lab.springjpa.manytomany.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultCourseService implements CourseService {

    private final CourseRepository courseRepository;

    @Override
    @Transactional
    public void deleteAll() {
        courseRepository.deleteAll();
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return courseRepository.save(course);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Course> findAll() {
        return courseRepository.findAll();
    }


}
