package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path="api/v1/student")
public class studentcontroller {
    private final studentservice studentservice;
    @Autowired
    public studentcontroller(studentservice studentservice){
        this.studentservice=studentservice;
    }
    @GetMapping
    public List<student> getstudent(){
        return studentservice.getstudent();
    }

}
