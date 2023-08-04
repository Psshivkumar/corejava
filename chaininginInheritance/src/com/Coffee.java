package com;

public class Coffee {

	public double area;
	public double value;
	public String color;
	public char size;

	public Coffee(double area, double value, String color, char size) {

		this.area = area;
		this.value = value;
		this.color = color;
		this.size = size;
		System.out.println("invoke double,double,String,char const in Coffee");
	}
}
