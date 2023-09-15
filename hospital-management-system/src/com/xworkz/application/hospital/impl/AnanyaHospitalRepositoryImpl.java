package com.xworkz.application.hospital.impl;

import com.xworkz.application.hospital.HospitalRepository;
import com.xworkz.application.patient.Patient;

public class AnanyaHospitalRepositoryImpl implements HospitalRepository {

	Patient patient[];
	int index;

	public AnanyaHospitalRepositoryImpl(int size) {
		// TODO Auto-generated constructor stub
		patient = new Patient[size];
	}

	@Override
	public boolean savePatient(Patient patient) {
		boolean isAdded = false;

		if (patient != null) {
			this.patient[index] = patient;
			index++;
			isAdded = true;

		}

		return isAdded;
	}

}
