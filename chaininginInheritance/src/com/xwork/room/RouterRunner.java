package com.xwork.room;

public class RouterRunner {

	public static void main(String[] args) {

		Modem modem = new Modem();
		System.out.println(modem.color);
		System.out.println(modem.location);
		System.out.println(modem.price);
		System.out.println(modem.size);

		Modem modem2 = new Modem("window", 1900, 'x', "red");

	}

}
