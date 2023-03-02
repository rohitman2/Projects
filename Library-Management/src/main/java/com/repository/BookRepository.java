package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.models.Book;


public interface BookRepository extends CrudRepository<Book, Integer>{

}