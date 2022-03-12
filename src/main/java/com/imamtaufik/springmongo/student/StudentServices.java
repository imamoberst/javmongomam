package com.imamtaufik.springmongo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {
    private final StudentRepo studentRepo;

    public StudentServices(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Student> getAllStudents() {
        return studentRepo.findAll();
    }

    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
