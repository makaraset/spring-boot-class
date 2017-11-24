package com.mkr.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mkr.model.Book;

@Service
public class BookService {
	
	private List<Book> books = new ArrayList<>();

	public BookService() {
		books.add(new Book(1, "Java Programming for Android Developers", new Date() , "David Backam", 1200, "https://images-na.ssl-images-amazon.com/images/I/51ncbqruTZL._SX396_BO1,204,203,200_.jpg"));
		books.add(new Book(2, "A Beginner's Guide, Seventh Edition", new Date() , "Herbert Schildt", 575, "https://images-na.ssl-images-amazon.com/images/I/41SfK-5%2BD9L._SX397_BO1,204,203,200_.jpg"));
		books.add(new Book(3, "A Complete Introduction to the Python Language", new Date() , "Mark Summerfield", 673, "https://images-na.ssl-images-amazon.com/images/I/51d2L5UWKxL._SX388_BO1,204,203,200_.jpg"));
	}
	
	public List<Book> findAll() {
		return books;
	}
	
	public Book findById(int id) {
		return books.get(id-1);
	}
	
	
}
