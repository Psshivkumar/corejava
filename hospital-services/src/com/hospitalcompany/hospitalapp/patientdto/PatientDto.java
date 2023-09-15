package com.hospitalcompany.hospitalapp.patientdto;

import com.hospitalcompany.hospitalapp.constant.BloodGroup;
import com.hospitalcompany.hospitalapp.constant.Gender;

public class PatientDto {
	private int patientId;
	private String name;
	private int age;
	private String address;
	private BloodGroup bloodGroup;
	private long phNo;
	private Gender gender;
	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	private String wardNo;
	private String attenderName;
	private String hospitalName;

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public String getWardNo() {
		return wardNo;
	}

	public void setWardNo(String wardNo) {
		this.wardNo = wardNo;
	}

	public String getAttenderName() {
		return attenderName;
	}

	public void setAttenderName(String attenderName) {
		this.attenderName = attenderName;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

}
