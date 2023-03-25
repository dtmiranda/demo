package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/*
* the repository anotation used to represent (class/interface) who is responsible for data connection
* this interface extend JpaRepository that allow us to use methods like(find, findAll, delete.......)
* the generics represent:
*       Student is the type of data we work with
*       Long is the type of the student id.
*
* */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
