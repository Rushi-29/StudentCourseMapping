package com.geekster.StudentCourseManagement.controller;

import com.geekster.StudentCourseManagement.models.Course;
import com.geekster.StudentCourseManagement.service.CourseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseService courseService;


    @PostMapping("/add")
    public ResponseEntity<Course> createCourse(@RequestBody Course course) {
        Course createdCourse = courseService.createCourse(course);
        return ResponseEntity.ok(createdCourse);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Course>> getAllCourses() {
        List<Course> courses = courseService.getAllCourses();
        return ResponseEntity.ok(courses);
    }

    @GetMapping("/{title}")
    public Course getCourseById(@PathVariable String title) {
        return  courseService.getCourseByTitle(title);
    }

    @PutMapping("/update")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course) {
        Course updatedCourse = courseService.updateCourse(course);
        return ResponseEntity.ok(updatedCourse);
    }

    @DeleteMapping("/{title}")
    public ResponseEntity<Void> deleteCourse(@PathVariable String title) {

        HttpStatus status;
        try {
            courseService.deleteCourseByTitle(title);
            status = HttpStatus.OK;
        }
        catch(Exception e)
        {
            System.out.println(e);
            status = HttpStatus.NOT_ACCEPTABLE;
        }
        return new ResponseEntity<Void>(status);
    }
}
