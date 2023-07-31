package com.tooth;

import com.tooth.comp.Company;
import com.tooth.comp.ing.Ingradients;

public class Toothpaste {

	public String name;
	public String brand;
	public Company company;
	public Ingradients[] ingradients;
	
	public Toothpaste(String name,String brand,Company company,Ingradients[] ingradients)
	{
		this.name=name;
		this.brand=brand;
		this.company=company;
		this.ingradients=ingradients;
		
		
	}
 
	public void printInfo() {
		System.out.println("information of Toothpaste");
		System.out.println("name: "+this.name);
		System.out.println("brand: "+this.brand);
	    company.printInfo();
	    
	   for(int i=0;i<ingradients.length;i++)
	   {
		   Ingradients ingradient=ingradients[i];
		   
		   System.out.println("ingradient at index "+i+ "is" +ingradients[i]);
		   
	   }


		
		
	}
}
