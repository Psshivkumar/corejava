package com.xworkz.abstraction.app;

public class Browser {

	private Internet internet;

	public void setInternet(Internet internet) {
		this.internet = internet;
	}

	public void connecting() {
		System.out.println("invoke connecting in browser");
		this.internet.connect();
		this.internet.supply();
	}

}
