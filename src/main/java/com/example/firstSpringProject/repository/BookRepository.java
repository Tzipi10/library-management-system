package com.example.firstSpringProject.repository;

import com.example.firstSpringProject.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
