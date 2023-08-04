package com;

public class Cappuccino extends Coffee {
	
	public Cappuccino()  {
		

		super(190.0, 10.0, "shiny", 'm');
		System.out.println("invoking no arg const in cappucino");

	}
	

	public Cappuccino(double area, double value, String color, char size) {
        super(area,value,color,size);
		this.area=area;
		this.value=value;
		this.color=color;
		this.size=size;
		
		System.out.println("invoking all par  const in Cappuccino");

	}

}
