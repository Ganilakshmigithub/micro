package com.spring.micro.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.micro.entities.Students;
import com.spring.micro.entities.Subject;
import com.spring.micro.services.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;

    @PostMapping("/create")
    public Students addStudent(@RequestBody Students s){
        return studentService.addStudent(s);
    }

    @GetMapping("/get/{name}")
    public List<Students> getStudentByName(@PathVariable String name){

        return studentService.getStudentByName(name);
    }

    @GetMapping("/byage/{age}")
    public List<Students> getStudentByAge(@PathVariable int age) {
        return studentService.getStudentByAge(age);
    }

    @GetMapping("/getallstudents")
    public Page<Students> getAllStudents(@RequestParam int page,@RequestParam int size) {
        return studentService.getAllStudents(page,size);
        }


    @GetMapping("/byId/{id}")
     public void getStudentById(@PathVariable int id){
        studentService.getStudentById(id);
     }
    
     @GetMapping("/byname/{name}")
     public List<Subject> FindSubByName(@PathVariable String name){
       return studentService.FindSubByName(name);
     }

}
