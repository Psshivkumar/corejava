package com.xworkzcollectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class Tree {

	public static void main(String[] args) {

		
		Collection<Object> names = new ArrayList();
		names.add("odeya");
		names.add("masterpiece");
		names.add("bulbul");
		names.add("a");
		names.add("b");
		names.add("m");
		names.add(11);
		names.clear();
		
			System.out.println(names);
			//<>generics

			for(Object name:names) {                           
				System.out.println(name);
			}
		

	}

}
