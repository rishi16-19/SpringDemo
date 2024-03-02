package com.ibm.book.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.book.entity.Book;


@Repository
public interface BookRepo extends JpaRepository<Book, Integer> {

}
