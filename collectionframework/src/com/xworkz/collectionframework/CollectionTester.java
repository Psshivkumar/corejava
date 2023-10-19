package com.xworkzcollectionframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTester {

	public static void main(String[] args) {

		java.util.List<String> cities = new LinkedList<String>();
		cities.add("davangetre");
		cities.add("bangalore");
		cities.add("shivamogga");
		cities.add("harihara");
		cities.add("ballari");
		System.out.println("+++++++++++++++++++");

		List<String> cities1= new LinkedList<String>();
		cities1.add("chikkamangalur");
		cities1.add("koli");
		cities1.add("davangetre");
		cities1.add("bangalore");
		cities1.add("");
		cities1.add("");
		cities1.add("");
		cities1.add("");
		cities1.add(5, "xyz");
		cities.addAll(cities1);
		cities.remove(0);
		cities.contains("bangalore");
		System.out.println(cities.contains("bangalore"));
		System.out.println(cities.containsAll(cities1));
		System.out.println(cities.remove(2));
		System.out.println(cities.removeAll(cities1));
		System.out.println(cities.size());
		

		for (String city : cities) {
			System.out.println(city);
		}
		for (String city1 : cities1) {
			System.out.println(city1);
		}
		System.out.println(cities.get(1));
		//insertion order ordred collection preserve the order of insertion

	}

}
