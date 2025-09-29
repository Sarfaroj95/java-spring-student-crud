package com.student.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.restapi.entity.Book;

public interface  BookRepository extends JpaRepository<Book, Integer> {

}
