package com.xworkz.abstraction.app;

public class FiveG implements Internet {

	@Override
	public void supply() {
		System.out.println("invole supply in fiveg");
	}

	@Override
	public void connect() {
		System.out.println("inovoke connect in fiveg");
	}

}
