package com.example.demo.student;

import jakarta.persistence.*;

@Entity
@Table
public class student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1


    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator="student_sequence"
    )
    private long id;
    private String name;

    public student(){

    }
     public student(long id,
     String name){
        this.id= id;
        this.name= name;
     }
    public student(String name){
        this.name= name;
    }
    public long getId(){
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "student{"+ "id"+id +",name"+name+'}';
    }
}
