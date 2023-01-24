package com.example.student.controller;

import com.example.student.model.Student;
import com.example.student.service.StudentService;
import com.example.student.util.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("api")
public class StudentController {

    @Autowired
    public StudentService studentService;

    @GetMapping("getStudent")
    Response getStudent(Long id){
        return studentService.getStudent(id);
    }


    @PostMapping("insertStudent")
    Response insertStudent(Student student){
        return studentService.insertStudent(student);
    }

    @DeleteMapping("deleteStudent")
    Response deleteStudent(Long id){
        return studentService.deleteStudent(id);
    }
    @DeleteMapping("getAll")
    Response getAll(){
        return studentService.getAll();
    }

}
