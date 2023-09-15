package com.tap.technicalaptitude;

import java.util.Scanner;

public class Factorial {
//straight forword
	static int factorial(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res = res * i;
		}

		return res;

	}

	// reverse order
	public static int fact(int x) {

		int fac = 1;
		for (int i = x; i >= 1; i--) {
			fac = fac * i;

		}
		return fac;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		int n = scanner.nextInt();
		int x = scanner.nextInt();

		System.out.println(Factorial.factorial(n));
		System.out.println(Factorial.fact(x));
	}

}
