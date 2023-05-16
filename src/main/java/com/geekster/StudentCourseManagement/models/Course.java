package com.geekster.StudentCourseManagement.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @EmbeddedId
    private CourseKey id;

    private String title;
    private String description;
    private String duration;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_Student_student_id")
    private List<Student> studentList;


}
