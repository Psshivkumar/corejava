package com.xworkz.abstraction.app;

public class Immigration implements PassportVerification {

	@Override
	public void verify() {
		System.out.println("invoke verify in Immigration");
	}

}
