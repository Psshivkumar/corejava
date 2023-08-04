package com.xwork.room;

public class DiamondRunner {

	public static void main(String[] args) {
		
		Gold gold=new Gold();
		System.out.println(gold.apearance);
		System.out.println(gold.area);
		System.out.println(gold.carrat);
		System.out.println(gold.value);
		
		Gold gold2=new Gold(90, 80, "Brigth", 22);

		

	}

}
