package com.study.springboot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent(){
        return studentRepository.findAll();
    }


    public void addNewStudent(Student student) {
        Optional<Student> studentOptional =  studentRepository.findStudentByEmail(student.getEmail());

        //if the student email exists
        if (studentOptional.isPresent()){
            throw  new IllegalStateException("Email taken!..");
        }

        System.out.println(student);
        studentRepository.save(student);


    }

    public void deleteStudent(Long studentId) {
        boolean studentExists = studentRepository.existsById(studentId);

        if(!studentExists){
            throw new IllegalStateException("Student with id " + studentId+ "does not exists");

        }

        studentRepository.deleteById(studentId);

    }
}
