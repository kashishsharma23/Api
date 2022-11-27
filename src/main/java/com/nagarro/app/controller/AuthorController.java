package com.nagarro.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.app.entity.Author;
import com.nagarro.app.services.AuthorServices;

@RestController
public class AuthorController {

	@Autowired
	AuthorServices authorServices;
	
	@PostMapping("/authors")
	@ResponseBody
	public void insert(@RequestBody Author author)
	{
		authorServices.insert(author);

	}

	@GetMapping("/authors")
	@ResponseBody
	public List<Author> getAll()
	{
		return authorServices.getAll();
	}
	
	@GetMapping("/authors/{name}")
	@ResponseBody
	public Optional<Author> get(@PathVariable("name") String name)
	{
		return authorServices.get(name);
	}
	
	@PutMapping("/authors/{name}")
	@ResponseBody
	public void update(@PathVariable("name") String name,@RequestBody Author author)
	{
		 authorServices.update(name,author);
	}
	
	@DeleteMapping("/authors/{name}")
	@ResponseBody
	public void delete(@PathVariable("name") String name)
	{
		authorServices.delete(name);
	}
}
