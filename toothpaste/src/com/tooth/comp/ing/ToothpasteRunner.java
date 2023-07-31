package com.tooth.comp.ing;

import com.tooth.Toothpaste;
import com.tooth.comp.Company;

public class ToothpasteRunner {

	public static void main(String[] args) {

	   String name="colgate maxfresh";
	   String brand="Colgate";
	   
	   Company company=new Company("dabar","dantakanti","pepsudant");
	   
	   Ingradients i = new Ingradients("salt", 3.0f, 10);
	   Ingradients i1 = new Ingradients("water", 2.0f, 5);
	   Ingradients i2 = new Ingradients("zinc",2.0f,15);
	   Ingradients i3 = new Ingradients("silica", 3.0f, 13);
	   Ingradients i4 = new Ingradients("phospate", 4.0f, 20);
	   Ingradients[] ingradient= {i,i1,i2,i3,i4};
	   
	   Toothpaste toothpaste=new Toothpaste(name,brand,company,ingradient);
	   toothpaste.printInfo();
	   
		
	}

}
