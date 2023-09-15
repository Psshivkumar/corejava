package com.xworkzcollectionframework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class Arraylist {
	public static void main(String[] args) {
		int size = 5;
		String movieName[] = new String[size];
		movieName[0] = "ushh";
		movieName[1] = "a";
		movieName[2] = "Upendra";
		movieName[3] = "UI";
		movieName[4] = "Dboss";
		// System.out.println(movieName);

		List<String> names = new LinkedList<String>();
		if (names.isEmpty()) {
			names.add("googly");
			names.add("rajahuli");
			names.add("bulbul");
			names.add("a");
			names.add("b");
			names.add("m");
		}
		Collection<String> names1 = new LinkedList<String>();

		if (names1.isEmpty()) {
			names1.add("googly");
			names1.add("rajahuli");
			names1.add("gajakesari");
			names1.add("dhool");
		}
		// names.addAll(names1);
		names1.retainAll(names);
		System.out.println("names data " + names);
		System.out.println("names1 data " + names1);

		// <>generics

	}

}
