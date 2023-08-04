package com.xwork.room;

public class Gold extends Diamond{

	public Gold()  {

		super(190.0, 10.0, "shiny", 24);
		System.out.println("invoking no arg const in Gold");

	}
	

	public Gold(double area, double value, String apearance, int carrat) {
        super(area,value,apearance,carrat);
		this.area=area;
		this.value=value;
		this.apearance=apearance;
		this.carrat=carrat;
		
		System.out.println("invoking all par  const in Gold");

	}

	
}
