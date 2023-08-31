package com.xworkz.abstraction.app;

public class Airport implements PassportVerification {
	@Override
	public void verify() {
		System.out.println("invoke verify in Airport");
	}

}
