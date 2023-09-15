package com.tap.technicalaptitude;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static int digit(int n) {
		int count = 0;

		while (n > 0) {

			n = n / 10;

			count++;

		}

		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		CountNumberOfDigits countNumberOfDigits = new CountNumberOfDigits();
		System.out.println(CountNumberOfDigits.digit(n));

	}

}
