package com.xworkzcollectionframework;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueClass {

	public static void main(String[] args) {
		
		Queue<String> names=new PriorityQueue<String>();
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
