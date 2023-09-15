package com.tap.technicalaptitude;

import java.util.Scanner;

public class NumberOfTrailingZeroes {

	static int trail(int n) {
		int pow = 5;
		int res = 0;

		while (n >= pow) {
			res = res + n / pow;
			pow = pow * 5;

		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(NumberOfTrailingZeroes.trail(n));
	}

}
