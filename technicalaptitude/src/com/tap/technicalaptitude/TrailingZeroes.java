package com.tap.technicalaptitude;

import java.util.Scanner;

public class TrailingZeroes {

	static int trailingZero(int n) {
		int res = 0;
		int pow5 = 5;

		while (n >= pow5) {

			res = res + n / pow5;
			pow5 = pow5 * 5;
		}

		return res;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(TrailingZeroes.trailingZero(n));
	}

}
