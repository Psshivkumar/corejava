package com.tap.technicalaptitude;

public class Fibonacci {
	
	//Written with the help of recursion function 
	
	
	static long fibo(long n) {
		if(n==1||n==2) {
			
			return 1;
		}
		return fibo(n-1)+fibo(n-2);

	}
	public static void main(String[] args) {
		
		System.out.println(Fibonacci.fibo(33));
		
	}

}
