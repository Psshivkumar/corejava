package com.xworkz.application.app.repository;

public class Metro {
	int metroId;
	int compartments;
	String source;
	String destination;

	public Metro(int metroId, int compartments, String source, String destination) {

		this.metroId = metroId;
		this.compartments = compartments;
		this.source = source;
		this.destination = destination;
	}

	public void displayDetails() {
		System.out.println("metro Id is " + metroId);
		System.out.println("no of compartments are " + compartments);
		System.out.println("metro source " + source);
		System.out.println("metro Destination " + destination);

	}

}
