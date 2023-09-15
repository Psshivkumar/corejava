package com.hospitalcompany.hospitalapp.hospital.impl;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.hospitalcompany.hospitalapp.constant.BloodGroup;
import com.hospitalcompany.hospitalapp.constant.Gender;
import com.hospitalcompany.hospitalapp.patientdto.PatientDto;

public class AppolloHospitalImpl implements Hospital {

	public PatientDto patients[];
	int index;
	int id;

	public AppolloHospitalImpl(int size) {

		patients = new PatientDto[size];
	}

	@Override
	public boolean addPatients(PatientDto patients) {
		boolean isAdded = false;
		if (patients != null) {
			patients.setPatientId(++id);
			this.patients[index++] = patients;
			isAdded = true;
		} else {
			System.out.println("the patient details is null ...please provide valid details");
		}

		return isAdded;
	}

	@Override
	public boolean updatePatientAgeByName(int updatedAge, String existingName) {
		boolean isAgeUpdated = false;
		for (index = 0; index < patients.length; index++) {
			if (patients[index].getName().equals(existingName)) {
				patients[index].setAge(updatedAge);
				isAgeUpdated = true;
			}
		}
		return isAgeUpdated;
	}

	@Override
	public boolean updatePatientNamebyPatientId(String updatedName, int existingPatientId) {
		boolean isNameUpdated = false;
		for (index = 0; index < patients.length; index++) {
			if (patients[index].getPatientId() == existingPatientId) {
				patients[index].setName(updatedName);
				isNameUpdated = true;
			}
		}
		return isNameUpdated;

	}

	@Override
	public boolean updatePatientWardNoByPatientName(String updatedWardNo, String existingsName) {
		boolean isWardNoUpdated = false;
		for (index = 0; index < patients.length; index++) {
			if (patients[index].getName().equals(existingsName)) {
				patients[index].setWardNo(updatedWardNo);
				isWardNoUpdated = true;
			}
		}
		return isWardNoUpdated;
	}

	@Override
	public boolean deletePatientByPatientId(int patientId) {
		boolean isPatientDeleted = false;
		// PatientsDTO newPatients[]= new PatientsDTO[patients.length -1];
		int oldIndex, newIndex;
		for (oldIndex = 0, newIndex = 0; oldIndex < patients.length; oldIndex++) {
			if (!(patients[oldIndex].getPatientId() == patientId)) {
				patients[newIndex++] = this.patients[oldIndex];
			}
		}

		patients = Arrays.copyOf(patients, newIndex);
		System.out.println(Arrays.toString(patients));
		isPatientDeleted = true;
		return isPatientDeleted;
	}

	@Override
	public void getAllPatients() {

		System.out.println("the patient details are here");
		for (int patientindex = 0; patientindex < patients.length; patientindex++) {
			System.out.println(patients[patientindex]);
		}
	}

	@Override
	public String getAttenderNamebyPatientId(int patientID) {
		String attenderName = null;
		for (int index = 0; index < patients.length; index++) {
			if (patients[index].getPatientId() == patientID) {
				attenderName = patients[index].getAttenderName();
			}
		}

		return attenderName;
	}

	@Override
	public Gender getGenderbyName(String name) {
		Gender gender = null;
		for (int index = 0; index < patients.length; index++) {
			if (patients[index].getName().equals(name)) {
				gender = patients[index].getGender();
			}
		}
		
		return gender;
	}

	@Override
	public int getAgeByPatientId(int patientId) {
		int age = 0;
		for (int index = 0; index < patients.length; index++) {
			if (patients[index].getPatientId() == patientId) {
				age = patients[index].getAge();
			}
		}
		
		return age;
	}

	@Override
	public String getAddressByName(String name)  {
		String address = null;
		for (int index = 0; index < patients.length; index++) {
			if (patients[index].getName().equals(name)) {
				address = patients[index].getAddress();
			}
		}
		
		return address;
	}

	@Override
	public BloodGroup getBloodGroupByName(String name) {
		BloodGroup bloodGroup = null;
		for (int index = 0; index < patients.length; index++) {
			if (patients[index].getName().equals(name)) {
				bloodGroup = patients[index].getBloodGroup();
			}
		}
		if (bloodGroup == null) {

		}
		return bloodGroup;
	}

	@Override
	public PatientDto getPatientsByPatientId(int patientId) {
		PatientDto patient = null;
		for (int index = 0; index < patients.length; index++) {
			if (patients[index].getPatientId() == patientId) {
				patient = patients[index];
			}
		}
		return patient;
	}

}
