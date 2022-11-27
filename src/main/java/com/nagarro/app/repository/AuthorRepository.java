package com.nagarro.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.nagarro.app.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, String> {

}
