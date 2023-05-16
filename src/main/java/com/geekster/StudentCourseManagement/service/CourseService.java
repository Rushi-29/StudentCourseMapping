package com.geekster.StudentCourseManagement.service;

import com.geekster.StudentCourseManagement.models.Course;
import com.geekster.StudentCourseManagement.repository.ICourseRepository;
import com.geekster.StudentCourseManagement.repository.IStudentRepository;
import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CourseService {
    @Autowired
    ICourseRepository courseRepository;

    @Autowired
    IStudentRepository studentRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseByTitle(String title) {
        return courseRepository.findByTitle(title);
    }

    public Course updateCourse(Course course) {
        return courseRepository.save(course);
    }



    public void deleteCourseByTitle(String title) {
        Course course = courseRepository.findByTitle(title);
        if (course!=null) {
            courseRepository.delete(course);
        } else {
            // Handle the case where the course with the specified title doesn't exist
            throw new IllegalStateException("Course not found");
        }
    }
}
