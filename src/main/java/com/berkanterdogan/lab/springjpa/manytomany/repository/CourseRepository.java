package com.berkanterdogan.lab.springjpa.manytomany.repository;

import com.berkanterdogan.lab.springjpa.manytomany.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
