package com.berkanterdogan.lab.springjpa.manytomany.service.impl;

import com.berkanterdogan.lab.springjpa.manytomany.domain.Course;
import com.berkanterdogan.lab.springjpa.manytomany.domain.Student;
import com.berkanterdogan.lab.springjpa.manytomany.service.CourseService;
import com.berkanterdogan.lab.springjpa.manytomany.service.ManyToManyExampleService;
import com.berkanterdogan.lab.springjpa.manytomany.service.StudentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class DefaultManyToManyExampleService implements ManyToManyExampleService {

    private final CourseService courseService;
    private final StudentService studentService;

    @Override
    @Transactional
    public void deleteAllData() {
        log.info("Deleting all data....");
        courseService.deleteAll();
        studentService.deleteAll();
    }

    @Override
    @Transactional
    public void saveData() {
        log.info("Saving data....");

        Student student1 = Student.createWithoutId("fn1", "ln1");
        studentService.save(student1);
        Student student2 = Student.createWithoutId("fn2", "ln2");
        studentService.save(student2);
        Student student3 = Student.createWithoutId("fn3", "ln3");
        studentService.save(student3);
        Student student4 = Student.createWithoutId("fn4", "ln4");
        studentService.save(student4);
        Student student5 = Student.createWithoutId("fn5", "ln5");
        studentService.save(student5);

        Course course1 = Course.createWithoutId("Physics", List.of(student1, student2, student3));
        courseService.save(course1);

        Course course2 = Course.createWithoutId("Maths", List.of(student4, student5));
        courseService.save(course2);

    }

    @Override
    @Transactional(readOnly = true)
    public void queryCourse() {
        log.info("courseService.findAll - FETCH objects of Course EAGERLY: ");
        courseService.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public void queryStudent() {
        log.info("studentService.findAll - FETCH objects of Student LAZY: ");
        List<Student> students = studentService.findAll();
        log.info("studentService.findAll - students.get(0).getCourses().get(0).getName() is fetching now...");
        students.get(0).getCourses().get(0).getName();
    }
}
