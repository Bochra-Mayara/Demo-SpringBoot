package com.bochra.demo.Student;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Students")
public class StudentController {
    
    private StudentService service;
    @Autowired
    public StudentController(StudentService service){
        this.service=service;
    }
    @GetMapping
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }
    
}
