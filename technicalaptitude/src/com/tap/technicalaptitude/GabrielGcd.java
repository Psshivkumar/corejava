package com.tap.technicalaptitude;

import java.util.Scanner;

public class GabrielGcd {

	static int gcd(int a, int b) {

		while (a != 0 && b != 0) {
			if (a > b) {

				a = a % b;

			} else {

				b = b % a;
			}

		}
		if (a != 0) {
			return a;
		} else {
			return b;
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(GabrielGcd.gcd(a, b));

	}

}
