package com.tap.technicalaptitude;

import java.util.Scanner;

public class Factorial1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 1;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}
		System.out.println(res);
		for (int i = n; i >=1; i--) {
			fact = fact * i;
		}
		System.out.println(fact);

	}

}
