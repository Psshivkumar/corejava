package com;

public class CoffeeRunner {

	public static void main(String[] args) {
		
		Cappuccino cappuccino=new Cappuccino();
		System.out.println(cappuccino.area);
		System.out.println(cappuccino.color);
		System.out.println(cappuccino.value);
		System.out.println(cappuccino.size);
		
		
		Cappuccino cappuccino2=new Cappuccino(100, 1000, "brown", 'm');
		


	}

}
