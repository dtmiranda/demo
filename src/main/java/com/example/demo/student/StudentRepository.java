package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*
* the repository */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
