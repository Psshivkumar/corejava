package com.xworkzcollectionframework;

import java.util.HashSet;
import java.util.Set;
//it does not allow duplicate and multiple null values
//it does not preserve order of insertion

public class Setclass {

	public static void main(String[] args) {

		Set<String>  names = new HashSet<>();
		names.add("");
		names.add("");
		names.add("");
		names.add("");
		names.add("uppi");
		names.add("uppi");
		names.add("shastri");
		names.add("ayya");
		names.add("kranti");
	for(String name:names) {
		System.out.println(name);
	}
	}

}
