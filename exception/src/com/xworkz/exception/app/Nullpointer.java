package com.xworkz.exception.app;

import java.lang.*;

public class Nullpointer {

	public static void main(String[] args) {

		String s = null;
		try {
			int i = s.length();
		} catch (Throwable e) {
			System.out.println("nullpointer excetion");

		}
	}

}
