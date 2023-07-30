package com.boot.app;

import com.boot.Internet;

public class Browser {

	public Internet internet;
	
	public void search() {
		
		System.out.println("invoking search in Browser");
		if (internet!=null) {
			internet.accessability();
			
		}
	}
	
	
	public void chrome() {
		
		System.out.println("invoking chrome in Browser");
		if (internet!=null) {
			internet.cost();
			
		}
	}
	
}
