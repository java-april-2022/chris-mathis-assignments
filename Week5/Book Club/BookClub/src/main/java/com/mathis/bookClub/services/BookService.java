package com.mathis.bookClub.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mathis.bookClub.models.Book;
import com.mathis.bookClub.repositories.BookRepo;

@Service
public class BookService {
	
	@Autowired
	private BookRepo bookRepo;
	
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
	public Book add(Book book) {
		return bookRepo.save(book);
	}
	
	public void delete(Long id) {
		bookRepo.deleteById(id);
	}
	
	public Book details(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	
	public Book edit(Book book) {
		return bookRepo.save(book);
	}

}
