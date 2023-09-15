package com.tap.technicalaptitude;

import java.util.Scanner;

public class LcmOfTwoNmbers {

	static int lcm(int a, int b) {
		int res = 0;

		if (a > b) {
			res = a;

		} else {
			res = b;
		}

		while (true) {

			if (res % a == 0 && res % b == 0) {
				break;
			}
			res++;

		}
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(LcmOfTwoNmbers.lcm(a, b));

	}

}
