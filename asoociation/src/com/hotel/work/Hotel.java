package com.hotel.work;

import com.hotel.Cook;

public class Hotel {

	public Cook cook;
	
	public void menu() {
		
		System.out.println("invoking menu in Hotel");
		if (cook!=null) {
		cook.food();
		}
	}
	
	public void bestFood() {
		
		System.out.println("invoking bestFood in Hotel");
		if (cook!=null) {
		
		cook.famous();
	}
	
	
	}
}
