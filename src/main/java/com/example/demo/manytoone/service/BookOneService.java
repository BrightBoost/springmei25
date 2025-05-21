package com.example.demo.manytoone.service;

import com.example.demo.manytoone.models.Author;
import com.example.demo.manytoone.models.Book;
import com.example.demo.manytoone.repositories.AuthorOneRepository;
import com.example.demo.manytoone.repositories.BookOneRepository;
import org.springframework.stereotype.Service;


@Service
public class BookOneService {
    private BookOneRepository bookRepository;
    private AuthorOneRepository authorRepository;

    public BookOneService(BookOneRepository bookRepository, AuthorOneRepository authorRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
    }

    public Book addBook(Book book) {
        if(book.getAuthor() != null && book.getAuthor().getId() != null && book.getAuthor().getId() > 0) {
            Author author = authorRepository.findById(book.getAuthor().getId()).orElse(null);
            book.setAuthor(author);
        }
        return bookRepository.save(book);
    }
}
