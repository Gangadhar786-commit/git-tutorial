package com.lambda.program;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

	
	public List<Book> getBooks(){
		
		List<Book> books=new ArrayList<Book>();
		books.add(new Book(101,"Anuj",40));
		books.add(new Book(102,"Vaibhav",50));
		books.add(new Book(103,"Ajay",40));
		books.add(new Book(104,"Ganga",60));
		 return books;
	}
	}
