package com.bochra.demo.Student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    Student findByEmail(String email);
    void deleteByEmail(String email);
}
