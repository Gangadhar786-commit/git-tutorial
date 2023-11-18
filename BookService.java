package com.lambda.program;

import java.util.Collections;
import java.util.List;

public class BookService {

	
	public List<Book>  getBooksSort(){
		
		List<Book> books=new BookDao().getBooks();
		Collections.sort(books,(o1,o2)->o1.getName().compareTo(o2.getName()));
		return books;
	}
	
	public static void main(String[] args) {

		System.out.println(new BookService().getBooksSort());
	}
}
