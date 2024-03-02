package com.ibm.book.service;

import java.util.List;

import com.ibm.book.entity.Book;

public interface BookService {
	List<Book> findAll();
	Book findById(int id);
	void save(Book book);
	void put(Book book);
	void deleteById(int id);
}
