package com.xwork;

public class Rope  {
	public double length;
	public double price;
	public char size;
	public String color;

	public Rope(double length, double price, char size, String color) {

		this.length = length;
		this.price = price;
		this.size = size;
		this.color = color;
		System.out.println("invoke double,double,char,String const in Rope");
	}

}
