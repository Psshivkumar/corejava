package com.xworkz.task;

import java.util.Scanner;

public class AmazonPrime {
	
	public void addName(String name) {
		if (index < maovies.length) {
			boolean exist=checkIfExist(name);
			if(exist==false) {
			
			if (name != null) {
				maovies[index++] = name;
				System.out.println(name + "name is added");
			}else
			{
				System.out.println("name already present");
			}
			}

			else {
				System.out.println("name is null");
			}
		} else {
			System.out.println("out of range");
		}
	}

	public void getName() {
		for (int i = 0; i < maovies.length; i++) {
			System.out.println(maovies[i]);
		}
	}
	
	public boolean checkIfExist(String value)
	{
		boolean exist =false;
		for(int j=0;j<maovies.length;j++)
		{
			if(value==maovies[j]) 
				exist=true;
			
		}
		return exist;
	}
}
