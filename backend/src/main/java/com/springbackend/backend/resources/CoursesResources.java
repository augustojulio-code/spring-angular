package com.springbackend.backend.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbackend.backend.domain.Courses;
import com.springbackend.backend.services.CoursesServices;

@RestController
@RequestMapping("/courses")
public class CoursesResources {

    @Autowired
    private CoursesServices services;

    @GetMapping
    public ResponseEntity<List<Courses>> findAll() {

        List<Courses> list = services.findAll();

        return ResponseEntity.ok().body(list);
    }

    /*
     * @GetMapping
     * public List<Object> findAll() {
     * return null;
     * }
     */

}
