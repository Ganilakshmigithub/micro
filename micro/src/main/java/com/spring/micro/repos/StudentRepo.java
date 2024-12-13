package com.spring.micro.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.micro.entities.Students;

public interface StudentRepo extends JpaRepository<Students,Integer>{

    List<Students> findByName(String name);

    List<Students> findByAge(int age);
    
}
