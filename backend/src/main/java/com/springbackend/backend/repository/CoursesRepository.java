package com.springbackend.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbackend.backend.domain.Courses;

public interface CoursesRepository extends JpaRepository<Courses, Long> {

}
