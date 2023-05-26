package com.springbackend.backend.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbackend.backend.domain.Courses;
import com.springbackend.backend.repository.CoursesRepository;

@Service
public class CoursesServices {

    @Autowired
    private CoursesRepository repository;

    public List<Courses> findAll() {

        return repository.findAll();
    }
}
