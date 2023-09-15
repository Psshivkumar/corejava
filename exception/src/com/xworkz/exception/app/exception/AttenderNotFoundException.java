package com.xworkz.exception.app.exception;

public class AttenderNotFoundException extends RuntimeException {

	public AttenderNotFoundException(String errmsg) {
		System.out.println("attender not found");

	}

}
