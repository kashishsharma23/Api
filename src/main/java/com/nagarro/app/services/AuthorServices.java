package com.nagarro.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.app.entity.Author;
import com.nagarro.app.entity.Books;
import com.nagarro.app.repository.AuthorRepository;

@Service
public class AuthorServices {
	@Autowired
	AuthorRepository authorRepository;
	
	public void insert(Author author)
	{
		authorRepository.save(author);
	}

	
	public List<Author> getAll()
	{
		return authorRepository.findAll();
	}
	
	
	public Optional<Author> get( String name)
	{
		return authorRepository.findById(name);
	}
	
	
	public void update(String name,Author author)
	{
		Author author2=authorRepository.getById(name);
		author2.setName(author.getName());
		authorRepository.save(author2);
	}
	

	public void delete( String name)
	{
		authorRepository.deleteById(name);
	}

}
