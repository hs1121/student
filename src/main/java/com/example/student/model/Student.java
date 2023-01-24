package com.example.student.model;

import javax.persistence.*;



import static com.example.student.util.Constants.STUDENT_TABLE;

@Entity(name = STUDENT_TABLE)
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private int age;
    private int standard;
    private char division;


    public Student() {
    }

    public Student(String name, int age, int standard, char division) {
        this.name = name;
        this.age = age;
        this.standard = standard;
        this.division = division;
    }

    public long getId() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }
}


