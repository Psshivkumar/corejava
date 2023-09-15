package com.hospitalcompany.hospitalapp.hospital.impl;

import com.hospitalcompany.hospitalapp.constant.BloodGroup;
import com.hospitalcompany.hospitalapp.constant.Gender;
import com.hospitalcompany.hospitalapp.patientdto.PatientDto;

public interface Hospital {

	public boolean addPatients(PatientDto patients);

	public boolean updatePatientAgeByName(int updatedAge, String existingName);

	public boolean updatePatientNamebyPatientId(String updatedName, int existingPatientId);

	public boolean updatePatientWardNoByPatientName(String updatedWardNo, String existingsName);

	public boolean deletePatientByPatientId(int patientId);

	public void getAllPatients();

	public String getAttenderNamebyPatientId(int patientID);

	public Gender getGenderbyName(String name);

	public int getAgeByPatientId(int patientId);

	public String getAddressByName(String name);

	public BloodGroup getBloodGroupByName(String name);

	public PatientDto getPatientsByPatientId(int patientId);

}
