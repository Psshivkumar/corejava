package com.xworkz.exception.app;

import java.util.Scanner;

public class ExceptionRunner {

	public static void main(String[] args) {// scanner should be created outside the try block
		Scanner sc = null;
		System.out.println("enter the string ");
		try {
			sc = new Scanner(System.in);
			String str = sc.next();

			System.out.println(str.length());
			System.out.println(Integer.parseInt(str));

			System.out.println(89 / 00);
		} catch (NullPointerException | ArithmeticException | NumberFormatException e) {

			e.printStackTrace();

		} finally {
			System.out.println("inside finally block, closing sc");
			if (sc != null) {
				sc.close();
			}
		}
		System.out.println("end of main");
		{

			// instance initialization block or init block
		}
	}
}
