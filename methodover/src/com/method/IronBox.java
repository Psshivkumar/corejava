package com.method;

public class IronBox {

	public void iron() {

		System.out.println("invoke iron in IronBox");
		iron(5);
		

	}
	
	public void iron(int timeToHeat) {

		System.out.println("invoke int method in IronBox");
		System.out.println(timeToHeat);
		

	}
	

	public void iron(int timeToHeat,int noOfCloths) {

		System.out.println("invoke int,int method in IronBox");
		System.out.println(timeToHeat);
		System.out.println(noOfCloths);

	}
	
	public void iron(int timeToHeat,int noOfCloths,String company) {

		System.out.println("invoke int,int,String method in IronBox");
		System.out.println(timeToHeat);
		System.out.println(noOfCloths);
		System.out.println(company);
		iron(5,20);

	}
	
	
	
	
	

}
