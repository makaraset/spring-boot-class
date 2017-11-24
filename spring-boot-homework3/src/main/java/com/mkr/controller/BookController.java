package com.mkr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mkr.model.Book;
import com.mkr.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping(value = {"/","index", "/home", "/book"})
	public String getBooks(Model model) {
		List<Book> books = bookService.findAll(); 
		model.addAttribute("books", books);
		return "index";
	}
	
	@RequestMapping("/book/detail/{id}")
	private String getBookbyId(Model model,@PathVariable(name="id") int id ) {
		Book book = bookService.findById(id);
		model.addAttribute("book", book);
		
		return "bookdetail";
	}
}
