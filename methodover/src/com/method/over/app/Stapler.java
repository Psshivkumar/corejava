package com.method.over.app;

public class Stapler {

	public void folds() {
		System.out.println("invoke folds in stapler");
		folds(120,"iron");

	}

	public void folds(double price) {
		System.out.println("invoke double method in Stapler");
		System.out.println(price);

	}
	
	public void folds(double price,String metal) {
		System.out.println("invoke double,String method in Stapler");
		System.out.println(price);
		System.out.println(metal);

	}
	
	public void folds(double price,String metal,String company) {
		System.out.println("invoke double,String method in Stapler");
		System.out.println(price);
		System.out.println(metal);
		System.out.println(company);
		folds(price,metal);
		

	}
	
	
}
