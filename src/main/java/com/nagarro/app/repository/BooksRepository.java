package com.nagarro.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.app.entity.Books;

public interface BooksRepository extends JpaRepository<Books, Integer> {

}
