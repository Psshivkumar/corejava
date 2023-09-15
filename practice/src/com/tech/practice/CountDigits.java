package com.tech.practice;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {

		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		while (n > 0) {
			n = n / 10;
			res++;
		}
		System.out.println("numbers are " + res);

	}

}
