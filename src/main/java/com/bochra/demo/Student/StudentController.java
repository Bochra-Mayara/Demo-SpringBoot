package com.bochra.demo.Student;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/Students")
public class StudentController {
    
    private StudentService service;
    @Autowired
    public StudentController(
            @Qualifier("DBStudentService") StudentService service)
    {
        this.service=service;
    }
    @PostMapping
    public Student save(@RequestBody Student student){
        return service.save(student);

    }
    @GetMapping("/{email}")
    public Student findByEmail( @PathVariable("email") String email){
        return service.findByEmail(email);
    }
    @GetMapping
    public List<Student> findAllStudents(){
        return service.findAllStudents();
    }

    @PutMapping
    public Student StudentUpdate(@RequestBody Student student){
        return service.update(student);
    }
    @DeleteMapping("/{email}")
    public void delete(@PathVariable("email") String email){
        service.delete(email);
    }
    
}
