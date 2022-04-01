package com.berkanterdogan.lab.springjpa.manytomany.repository;

import com.berkanterdogan.lab.springjpa.manytomany.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
