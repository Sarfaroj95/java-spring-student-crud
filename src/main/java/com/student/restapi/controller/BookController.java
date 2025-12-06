package com.student.restapi.controller;

import com.student.restapi.entity.Book;
import com.student.restapi.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

	@Autowired
	BookRepository repo;
	
	@GetMapping("/books")
	public List<Book> getAllBook(){
		List<Book> books = repo.findAll();
		return books;
	}
	
	@GetMapping("/books/{id}")
	public Book getBook(@PathVariable int id) {
		Book book = repo.findById(id).get();
		return book;
	}
	
	@PostMapping("/books/add")
	public void saveBook(@RequestBody Book book) {
		repo.save(book);
	}
	
	@PutMapping("/books/update/{id}")
	public Book updateBook(@PathVariable int id, @RequestBody Book updateBook) {
		Book book = repo.findById(id).get();
		book.setTitle(updateBook.getTitle());
		book.setAuthor(updateBook.getAuthor());
		book.setIsbn(updateBook.getIsbn());
		book.setPrice(updateBook.getPrice());
		book.setPublishedDate(updateBook.getPublishedDate());
		repo.save(book);
		return book;
	}
	
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable int id) {
		Book book = repo.findById(id).get();
		repo.delete(book);
	}
	
	
	
	
	
}
