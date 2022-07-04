package com.org.tcs.service;

import com.org.tcs.model.Student;
import com.org.tcs.repository.StudentRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest

class StudentServiceImplTest {
    @InjectMocks
    StudentServiceImpl studentServiceImpl;
    @Mock
    StudentRepo studentRepo;

    @Test
    void createStudent() {
        Student student=new Student();
        student.setId(11);
        student.setName("raj");
        student.setAddress("hyd");
        studentServiceImpl.createStudent(student);
        Mockito.verify(studentRepo, Mockito.times(1)).save(student);
    }

    @Test
    void updateStudent() {
        Student student=new Student();
        student.setId(11);
        student.setName("raj");
        student.setAddress("blr");
        studentServiceImpl.updateStudent(student);
        Mockito.verify(studentRepo, Mockito.times(1)).save(student);
    }

    @Test
    void getById() {
        int id=11;
        Student student=new Student();
        student.setId(11);
        student.setName("raj");
        student.setAddress("blr");
        Optional<Student> optional= Optional.of(student);
        Mockito.when(studentRepo.getById(id)).thenReturn(optional);
        Student optional1=studentServiceImpl.getById(id);
        Assertions.assertEquals(optional,optional1);


    }

    @Test
    void deleteById() {
    }
}