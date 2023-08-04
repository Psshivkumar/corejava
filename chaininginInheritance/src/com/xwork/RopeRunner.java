package com.xwork;

import com.xwork.room.Modem;

public class RopeRunner {

	public static void main(String[] args) {

		
		Thred t = new Thred();
		System.out.println(t.color);
		System.out.println(t.length);
		System.out.println(t.price);
		System.out.println(t.size);

		Thred t2 = new Thred(120, 1900, 'x', "red");
	}

}
