package com.geekster.StudentCourseManagement.repository;

import com.geekster.StudentCourseManagement.models.Course;
import com.geekster.StudentCourseManagement.models.CourseKey;
import com.geekster.StudentCourseManagement.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}
