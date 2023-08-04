package com.xwork.room.app;

public class PoisonMushroom extends Mushroom {

	public PoisonMushroom() {

		super("mysore", 10.0, 'M', "brown");
		System.out.println("invoking no arg const in PoisonMushroom");

	}
	

	public PoisonMushroom(String place, double price, char size, String color) {
        super(place,price,size,color);
		this.color=color;
		this.place=place;
		this.price=price;
		this.size=size;
		
		System.out.println("invoking all par  const in PoisonMushroom");

	}
	
	

}
