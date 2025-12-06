package com.student.restapi.service;

import com.student.restapi.entity.Book;
import com.student.restapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService{
  public final BookRepository bookRepo;

  @Autowired
  public BookService(BookRepository bookRepo){
      this.bookRepo = bookRepo;
  }

  public List<Book> getAllBooks(){
      return bookRepo.findAll();
  }

  public Optional<Book> getBook(int id){
    return bookRepo.findById(id);
  }
}
