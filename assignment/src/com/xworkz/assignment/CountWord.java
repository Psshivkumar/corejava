package com.xworkz.assignment;

import java.util.Scanner;

public class CountWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;
		int c = 0;
		System.out.println("enter a sentence");

		str = scanner.nextLine();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				c++;
		}
		c = c + 1;
		System.out.println("number of words are:" + c);
	}

}
