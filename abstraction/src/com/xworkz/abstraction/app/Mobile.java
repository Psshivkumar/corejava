package com.xworkz.abstraction.app;

public class Mobile {
	private Updates updates;

	public void setUpdates(Updates updates) {
		this.updates = updates;
	}

	public void update() {
		System.out.println("invoke update in mobile");
		this.updates.newVersion();
	}
}
