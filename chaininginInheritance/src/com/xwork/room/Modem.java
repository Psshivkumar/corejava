package com.xwork.room;

public class Modem extends Router {
	
	public Modem() {

		super("wall", 10.0, 'M', "white");
		System.out.println("invoking no arg const in Modem");

	}
	

	public Modem(String location, double price, char size, String color) {
        super(location,price,size,color);
		this.color=color;
		this.location=location;
		this.price=price;
		this.size=size;
		
		System.out.println("invoking all par  const in Modem");

	}
	

}
