package com.method.over.app;

public class Hotel {

	public void itemnCost() {
		System.out.println("invoke itemnCost in Hotel");
		itemnCost("idly");
		itemnCost("idly", 10.0);

	}

	public void itemnCost(String item) {

		System.out.println("invoking String in itemncost ");
		System.out.println(item);

	}

	public void itemnCost(String item, double price) {

		System.out.println("invoking String,double in itemncost ");
		System.out.println(item);
		System.out.println(price);

	}

	public void itemnCost(String item, double price, int quantity) {

		System.out.println("invoking String,double,int in itemncost ");
		itemnCost("idly", 20.0);
		

	}

}
