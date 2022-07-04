package com.org.tcs.service;

import com.org.tcs.model.Student;

public interface Studentservice {
    public void createStudent( Student student);
    public void updateStudent( Student student);
    public Student getById(Integer id);
    public String deleteById(Integer id);
}
