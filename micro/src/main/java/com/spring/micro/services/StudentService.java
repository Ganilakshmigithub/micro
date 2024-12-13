package com.spring.micro.services;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.spring.micro.entities.*;
import com.spring.micro.repos.StudentRepo;
import com.spring.micro.repos.SubjectRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo studentRepo;

    @Autowired
    SubjectRepo subjectRepo;



    public Students addStudent(Students s){
        return studentRepo.save(s);
    }

    public List<Students> getStudentByName(String name){
        return studentRepo.findByName(name);

    }

    public List<Students> getStudentByAge(int age){
        return studentRepo.findByAge(age);
    }

    public void  getStudentById(int id){
         studentRepo.findById(id);
    }

    public Page<Students> getAllStudents(int page,int size){
        PageRequest pageable=PageRequest.of(page, size);
        return studentRepo.findAll(pageable);
    
    }

    public List<Subject> FindSubByName(String name){
        return subjectRepo.findSubByName(name);
    }

            }
        

    







    

