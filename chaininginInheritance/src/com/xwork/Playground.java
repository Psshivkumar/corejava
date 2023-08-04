package com.xwork;

public class Playground extends Ground{
	
	public Playground() {

		super(190.0, 10.0, 'M', 10000);
		System.out.println("invoking no arg const in Playground");

	}
	

	public Playground(double area, double value, char size, int radius) {
        super(area,value,size,radius);
		this.area=area;
		this.value=value;
		this.size=size;
		this.radius=radius;
		
		System.out.println("invoking all par  const in Playground");

	}


}
