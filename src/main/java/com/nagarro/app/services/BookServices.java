package com.nagarro.app.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.nagarro.app.entity.Books;
import com.nagarro.app.repository.BooksRepository;

@Service
public class BookServices {
	@Autowired
	BooksRepository repository;
	

	public void insert(Books books)
	{
		repository.save(books);
	}

	public List<Books> getAll()
	{
		return repository.findAll();
		
	}
	
	
	public Optional<Books> get( int bookcode)
	{
		return repository.findById(bookcode);
	}
	
	
	public void update( int bookcode,Books books)
	{
		Books book=repository.getById(bookcode);
		book.setBookname(books.getBookname());
		book.setAuthor(books.getAuthor());
		repository.save(book);
	}
	
	
	public void delete(@PathVariable("bookcode") int bookcode)
	{
		repository.deleteById(bookcode);
	}

}
