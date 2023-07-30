package com.pow;

import com.pow.batt.Battery;

public class PowerBank {

	public Battery battery;
	
	public void charging() {
		
		System.out.println("invoking charging in Powerbank");
		
		if (battery!=null) {
			
			battery.capacity();
		}
		
		
		
	}
	
public void time() {
		
		System.out.println("invoking time in PowerBank");
		
		if (battery!=null) {
			
			battery.duration();
		}
		
		
		
	}
}
