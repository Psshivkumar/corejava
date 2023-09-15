package com.xworkz.exception.app.exception;

public class PatientNotfoundException extends Exception {

	public PatientNotfoundException(String errmsg) {
		System.out.println("patient not found");
	}
}
