package com.tap.technicalaptitude;

import java.util.Scanner;

public class Euclidgcd {

	static int gcd(int a, int b) {

		while (a != b) {
			if (a > b) {

				a = a - b;
			} else {

				b = b - a;
			}
		}
		return a;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(Euclidgcd.gcd(a, b));

	}

}
