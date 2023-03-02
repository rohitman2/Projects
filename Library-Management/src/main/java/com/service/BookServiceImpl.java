package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.models.Book;
import com.repository.BookRepository;


@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookRepository bookRepository;

	@Override
	public void addBook(Book book) {
		bookRepository.save(book);
	}

	@Override
	public Book getBook(Integer bookId) {
		 return bookRepository.findOne(bookId);
	}
	
	@Override
	public Book updateBook(Integer BookId,Book book) {
		return bookRepository.save(book);
	}
	
	@Override
	public void deleteBook(Integer bookId) {
		bookRepository.delete(bookId);
	}

	@Override
	public List<Book> getAllBooks() {
		List<Book> books=new ArrayList<>();
		bookRepository.findAll().forEach(books::add);
		return books;
	}
}