package com.tap.technicalaptitude;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int res = 0;
		while (n > 0) {

			n = n / 10;
			res++;

		}
		System.out.println(res);
	}

}
