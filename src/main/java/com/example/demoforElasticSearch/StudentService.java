package com.example.demoforElasticSearch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    @Autowired
    StudentDao studentDao;

    public Student addStudent(Student student)
    {
        return studentDao.save(student);
    }
}
