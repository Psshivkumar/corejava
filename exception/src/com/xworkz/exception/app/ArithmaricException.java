package com.xworkz.exception.app;

public class ArithmaricException {

	public static void main(String[] args) {

		System.out.println("statement1");
		System.out.println("statement1");
		try {

			String str = null;
			System.out.println(str.charAt(67));

		} catch (Throwable e) {
			System.out.println(e);

		}

		System.out.println("statement1");
		System.out.println("statement1");
		System.out.println("statement1");

	}

}
