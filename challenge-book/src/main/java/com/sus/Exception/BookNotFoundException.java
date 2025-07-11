package com.sus.Exception;

public class BookNotFoundException  extends RuntimeException{

	public BookNotFoundException(String msg) {
		super(msg);
	}
}