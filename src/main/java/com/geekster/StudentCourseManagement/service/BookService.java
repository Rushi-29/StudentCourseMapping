package com.geekster.StudentCourseManagement.service;

import com.geekster.StudentCourseManagement.models.Book;
import com.geekster.StudentCourseManagement.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookService {
    @Autowired
    IBookRepository bookRepository;



    public Book createBook(Book book)
    {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks()
    {
        return bookRepository.findAll();
    }

    public Optional<Book> getBookById(Long bookId)
    {
        return bookRepository.findById(bookId);
    }

    public Book updateBook(Book book)
    {
        return bookRepository.save(book);
    }

    public void deleteBook(Long bookId)
    {
        bookRepository.deleteById(bookId);
    }
}
