package com.example.demo.manytoone.repositories;

import com.example.demo.manytoone.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorOneRepository extends JpaRepository<Author, Long> {
}
