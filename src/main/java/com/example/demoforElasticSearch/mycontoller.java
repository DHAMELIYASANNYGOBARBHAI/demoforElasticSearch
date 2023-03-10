package com.example.demoforElasticSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mycontoller
{
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    String home()
    {
        return "home";
    }

    @PostMapping("/add")
    Student addStudent(@RequestBody Student student)
    {
        return studentService.addStudent(student);
    }
}
