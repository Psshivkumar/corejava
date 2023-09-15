package com.xworkz.assignment;

import java.util.Scanner;

public class OddEven {
	

		 public static void main(String[] args) {

		  int a[] = new int[4];
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter the numbers");
		  for (int k = 0; k < 4; k++) {

		   a[k] = sc.nextInt();
		  }

		  for (int i = 0; i < 4; i++) {

		   if (a[i] % 2 == 0) {
		    System.out.println("number is even");

		   }else {
		    System.out.println("number is odd");
		    
		   }
		  }

		 }
		}


