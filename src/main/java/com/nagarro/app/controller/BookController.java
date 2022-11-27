package com.nagarro.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.nagarro.app.entity.Books;
import com.nagarro.app.services.BookServices;

@RestController
public class BookController {
	@Autowired
	BookServices bookServices;

	@PostMapping("/books")
	@ResponseBody
	public void insert(@RequestBody Books books) {

		bookServices.insert(books);

	}
	
	@GetMapping("/books")
	@ResponseBody
	public List<Books> getAll()
	{	
		return bookServices.getAll();
	}
	
	@GetMapping("/books/{bookcode}")
	@ResponseBody
	public Optional<Books> get(@PathVariable("bookcode") int bookcode)
	{
		return bookServices.get(bookcode);
	}
	
	@PutMapping("/books/{bookcode}")
	@ResponseBody
	public void update(@PathVariable("bookcode") int bookcode,@RequestBody Books books)
	{
		 bookServices.update(bookcode, books);
	}
	
	@DeleteMapping("/books/{bookcode}")
	@ResponseBody
	public void delete(@PathVariable("bookcode") int bookcode)
	{
		bookServices.delete(bookcode);
	}

	
}
