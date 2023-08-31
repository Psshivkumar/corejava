package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.Airport;
import com.xworkz.abstraction.app.Custom;
import com.xworkz.abstraction.app.PassportVerification;

public class CustomRunner {

	public static void main(String[] args) {

		PassportVerification passportVerification = new Airport();

		Custom custom = new Custom();
		custom.setPassportVerification(passportVerification);
		custom.verifyCitizen();
	}

}
