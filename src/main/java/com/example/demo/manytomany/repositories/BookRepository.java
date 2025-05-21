package com.example.demo.manytomany.repositories;

import com.example.demo.manytomany.models.BookMany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookMany, Long> {
}
