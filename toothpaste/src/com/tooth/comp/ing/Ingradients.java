package com.tooth.comp.ing;

public class Ingradients {
	
	public String name;
	public double quantity;
	public double cost;
	
	public Ingradients(String name,double quantity,double cost)
	{
		this.name=name;
		this.quantity=quantity;
		this.cost=cost;
		
	}
	
	public void printInfo() {
		System.out.println("Ingradients information");
		System.out.println("name is"+this.name);
		System.out.println("quantity is"+this.quantity);
		System.out.println("cost is"+this.cost);

		
	}

}
