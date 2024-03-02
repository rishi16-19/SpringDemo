package com.ibm.book.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.book.entity.Book;
import com.ibm.book.repo.BookRepo;
import com.ibm.book.service.BookService;


@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepo bookRepo;
	
	@Override
	public List<Book> findAll() {
		return bookRepo.findAll();
	}

	@Override
	public Book findById(int id) {
		return bookRepo.findById(id).get();
	}

	@Override
	public void save(Book book) {
		bookRepo.save(book);

	}

	@Override
	public void put(Book book) {
		bookRepo.save(book);

	}

	@Override
	public void deleteById(int id) {
		bookRepo.deleteById(id);

	}

}
