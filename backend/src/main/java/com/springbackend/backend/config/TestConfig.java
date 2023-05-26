package com.springbackend.backend.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.springbackend.backend.domain.Courses;
import com.springbackend.backend.repository.CoursesRepository;

@Configuration
public class TestConfig implements CommandLineRunner {

    @Autowired
    private CoursesRepository repository;

    @Override
    public void run(String... args) throws Exception {

        Courses c = new Courses();

        c.setName("Spring");
        c.setCategory("back-end");

        repository.save(c);

    }

}
