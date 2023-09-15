package com.xworkz.exception.app;

public class Exception {

	public static void main(String[] args) {

		try {
			Class.forName("com.xworkz.exception.app.Exception");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}
	
	

}