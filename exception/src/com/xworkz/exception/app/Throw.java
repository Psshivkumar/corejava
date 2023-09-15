package com.xworkz.exception.app;

public class Throw {

	public static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("person is not eligible to vote");
		} else {
			System.out.println("he is eligible to vote");
		}
	}
}
