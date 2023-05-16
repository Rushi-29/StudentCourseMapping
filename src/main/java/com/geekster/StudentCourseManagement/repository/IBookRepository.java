package com.geekster.StudentCourseManagement.repository;

import com.geekster.StudentCourseManagement.models.Address;
import com.geekster.StudentCourseManagement.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Book, Long> {
}
