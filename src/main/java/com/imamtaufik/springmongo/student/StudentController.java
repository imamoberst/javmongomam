package com.imamtaufik.springmongo.student;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private final StudentServices studentServices;

    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @GetMapping
    public List<Student> fetchAllStudents() {
    return studentServices.getAllStudents();
    };

    @PostMapping("add")
    public AddedStudent registerStudent(@RequestBody Student student) {
        studentServices.addNewStudent(student);
        return new AddedStudent(200,"ok bro!");
    }
}
