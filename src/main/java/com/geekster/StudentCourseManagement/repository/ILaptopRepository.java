package com.geekster.StudentCourseManagement.repository;

import com.geekster.StudentCourseManagement.models.Course;
import com.geekster.StudentCourseManagement.models.CourseKey;
import com.geekster.StudentCourseManagement.models.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepository extends JpaRepository<Laptop, Long> {
}
