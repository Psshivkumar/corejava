package com.xwork.room.app;

public class MushroomRunner {

	public static void main(String[] args) {
		PoisonMushroom p=new PoisonMushroom();
		System.out.println(p.color);
		System.out.println(p.place);
		System.out.println(p.price);
		System.out.println(p.size);
		
		PoisonMushroom p1= new PoisonMushroom("jsdgh", 19, 'l', "whitw");
		System.out.println(p1.color);
		System.out.println(p1.place);
		System.out.println(p1.price);
		System.out.println(p1.size);




		
		
	}

}
