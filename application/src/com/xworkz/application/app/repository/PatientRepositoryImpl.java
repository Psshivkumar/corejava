package com.xworkz.application.app.repository;

public class PatientRepositoryImpl implements PatientRepository {
	private int position;
	private String patients[] = new String[NUM];

	@Override
	public void type(String patient) {
		System.out.println("invoke type in Patient");
		if (position < NUM) {
			this.patients[position] = patient;
			System.out.println("patient " + patient + " at position" + position);
			this.position++;
		} else {
			System.err.println("no bed for patient");

		}

	}

}
