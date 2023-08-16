package com.xworkz.app;

public class Karchief {
	private double cost;
	private String color;
	private int numbers;
	private String pattern;
	private double length;
	private double width;
	private double area;

	public Karchief() {
		super();
	}

	public Karchief(double cost, String color, int numbers, String pattern, double length, double width, double area) {
		super();
		this.cost = cost;
		this.color = color;
		this.numbers = numbers;
		this.pattern = pattern;
		this.length = length;
		this.width = width;
		this.area = area;
	}
	
	@Override
	public String toString() {
		System.out.println("invoking tostring in karchief");
		return "cost: "+cost+" color: "+color+" numbers "+numbers+" pattern: "+pattern; 
	}

}
