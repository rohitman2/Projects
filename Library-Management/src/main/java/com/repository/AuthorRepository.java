package com.repository;

import org.springframework.data.repository.CrudRepository;

import com.models.Author;


public interface AuthorRepository extends CrudRepository<Author, Integer>{

}