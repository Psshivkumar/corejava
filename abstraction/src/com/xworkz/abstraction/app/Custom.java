package com.xworkz.abstraction.app;

public class Custom {

	private PassportVerification passportVerification;

	public void setPassportVerification(PassportVerification passportVerification) {
		this.passportVerification = passportVerification;
	}

	public void verifyCitizen() {

		System.out.println("invoke verifycitizen in custom");
		this.passportVerification.verify();
	}

}
