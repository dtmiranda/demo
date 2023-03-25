package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Samuel = new Student(
                "Samuel",
                "samuel@email.com",
                LocalDate.of(2000, Month.JANUARY, 5),
                23

            );

            Student Carlos = new Student(
                    "Carlos",
                    "Carlos@email.com",
                    LocalDate.of(2008, Month.DECEMBER, 5),
                    15

            );

            repository.saveAll(
                    List.of(Samuel, Carlos)
            );

        };
    }
}
