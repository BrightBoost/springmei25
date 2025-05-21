package com.example.demo.manytoone.repositories;

import com.example.demo.manytoone.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookOneRepository extends JpaRepository<Book, Long> {
}
