package com.org.tcs.service;

import com.org.tcs.model.Student;
import com.org.tcs.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class StudentServiceImpl implements Studentservice{

    @Autowired
    StudentRepo studentRepo;

    @Override
    public void createStudent(Student student) {
        studentRepo.save(student);
    }

    @Override
    public void updateStudent(Student student) {

        studentRepo.save(student);
    }

    @Override
    public Student getById(Integer id) {
        Student ll=((studentRepo.getById(id)));
        return ll;
    }

    @Override
    public String deleteById(Integer id) {
         studentRepo.deleteById(id);
     return "success";
    }
}
