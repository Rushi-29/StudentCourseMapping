package com.geekster.StudentCourseManagement.repository;


import com.geekster.StudentCourseManagement.models.Course;
import com.geekster.StudentCourseManagement.models.CourseKey;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ICourseRepository extends JpaRepository<Course, CourseKey> {
    Course findByTitle(String title);
}
