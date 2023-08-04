package com.xwork.room.app;

public class Mushroom {
	public String place;
	public double price;
	public char size;
	public String color;

	public Mushroom(String place, double price, char size, String color) {

		this.place = place;
		this.price = price;
		this.size = size;
		this.color = color;
		System.out.println("invoke String,double,char,String const in Mushroom");
	}

}
