package com.telusko.student_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentRepo repo;

    @RequestMapping("/getStudents")
    public List<Student> getStudents(){
//        return List.of(
//                new Student(1, "Ranga", 21),
//                new Student(1, "Ravi", 22),
//                new Student(1, "Satish", 23)
//        );
        return repo.findAll();

    }
}
