package com.example.demo.manytomany.repositories;

import com.example.demo.manytomany.models.AuthorMany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorMany, Long> {
}
