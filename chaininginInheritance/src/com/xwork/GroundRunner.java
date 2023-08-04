package com.xwork;

public class GroundRunner {

	public static void main(String[] args) {
		
	
		Playground playground=new Playground();
		System.out.println(playground.area);
		System.out.println(playground.radius);
		System.out.println(playground.size);
		System.out.println(playground.value);
		
		Playground playground2=new Playground(190, 110, 'k', 1000);



	}

}
