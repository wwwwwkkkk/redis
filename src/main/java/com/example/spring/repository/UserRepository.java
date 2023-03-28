package com.example.spring.repository;

import com.example.spring.DTO.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Teacher,Long>{

}



