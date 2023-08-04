package com.xwork;

public class Thred extends Rope {
	public Thred() {

		super(190.0, 10.0, 'M', "white");
		System.out.println("invoking no arg const in Thred");

	}
	

	public Thred(double length, double price, char size, String color) {
        super(length,price,size,color);
		this.color=color;
		this.length=length;
		this.price=price;
		this.size=size;
		
		System.out.println("invoking all par  const in thred");

	}

}
