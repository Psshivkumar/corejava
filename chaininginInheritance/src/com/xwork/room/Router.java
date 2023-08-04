package com.xwork.room;

public class Router {
	public String location;
	public double price;
	public char size;
	public String color;

	public Router(String location, double price, char size, String color) {

		this.location = location;
		this.price = price;
		this.size = size;
		this.color = color;
		System.out.println("invoke String,double,char,String const in Router");
	}

}
