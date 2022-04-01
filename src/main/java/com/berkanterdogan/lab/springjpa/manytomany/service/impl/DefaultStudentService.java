package com.berkanterdogan.lab.springjpa.manytomany.service.impl;

import com.berkanterdogan.lab.springjpa.manytomany.domain.Student;
import com.berkanterdogan.lab.springjpa.manytomany.repository.StudentRepository;
import com.berkanterdogan.lab.springjpa.manytomany.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultStudentService implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    @Transactional
    public void deleteAll() {
        studentRepository.deleteAll();
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> findAll() {
        return studentRepository.findAll();
    }


}
