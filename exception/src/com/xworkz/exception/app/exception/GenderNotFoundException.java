package com.xworkz.exception.app.exception;

public class GenderNotFoundException extends RuntimeException{
	
	public GenderNotFoundException() {

		System.out.println("Gender not found");
	}

}
