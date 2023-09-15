package com.xworkz.assignment;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int a[][] = new int[2][2];
		int sum = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the num");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		System.out.println("numbers are....");

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				sum = sum + a[i][j];
			}
			System.out.println();

		}
		System.out.println("sum " + sum);

	}

}
