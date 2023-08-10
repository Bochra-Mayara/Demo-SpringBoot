package com.bochra.demo.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class InMemoryStudentService implements StudentService{
    private final   InMemoryStudentDao dao;
    @Autowired
    public InMemoryStudentService(InMemoryStudentDao dao){
        this.dao=dao;
    }


    @Override
    public List<Student> findAllStudents() {
        
            return dao.findAllStudents();
    }

    @Override
    public Student save(Student s) {
       return dao.save(s);
    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);
    }
    
}
