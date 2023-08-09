package com.bochra.demo.Student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    public List<Student> findAllStudents(){
   return List.of(
            new Student(
                "Bochra",
                "Mayara",
                LocalDate.now(),
                "bochra@gmail.com",
                22

            ),
            new Student(
                "Student",
                "Mayara",
                LocalDate.now(),
                "aicha@gmail.com",
                21
                
            )
        );
    }
}
