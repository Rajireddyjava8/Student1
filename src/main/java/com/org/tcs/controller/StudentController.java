package com.org.tcs.controller;

import com.org.tcs.model.Student;
import com.org.tcs.service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class StudentController {
    @Autowired
    Studentservice studentservice;



    @PostMapping("/create")
    public void createStudent(@RequestBody Student student){
        studentservice.createStudent(student);
    }
    @PutMapping("/update")
    public void updateStudent(@RequestBody Student student){
        studentservice.updateStudent(student);
    }
    @GetMapping("/getById/{id}")
    public String getById(@PathVariable Integer id){
        String rr = String.valueOf(studentservice.getById(id));
        return rr;
    }
    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        String tt =studentservice.deleteById(id);
        return tt;
    }

}
