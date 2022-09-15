package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * packageName    : com.example.demo
 * fileName       : BookRepository
 * author         : yjseo
 * date           : 2022-09-04
 */
public interface BookRepository extends JpaRepository<Book, Long> {
}
