package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class studentservice {
    public List<student> getstudent(){
        return List.of(
                new student(
                        1,"rushan"
                )

        );
    }
}
