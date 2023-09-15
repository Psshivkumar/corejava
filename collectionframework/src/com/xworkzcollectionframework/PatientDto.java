package com.xworkzcollectionframework;

public class PatientDto {
	private int patientId;
	private String name;
	private int age;
	private String address;
	private BloodGroup bloodGroup;
	private long phNo;
	private Gender gender;

	public PatientDto(int patientId, String name, int age, String address, BloodGroup bloodGroup, long phNo,
			Gender gender) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.phNo = phNo;
		this.gender = gender;
	}

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

	public BloodGroup getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(BloodGroup bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public long getPhNo() {
		return phNo;
	}

	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
	return "PatientDto-(Patient Id = "+ this.patientId+", Patient Name = "+ this.name+",age="+this.age+",address="+this.address+",bloodgroup="+this.bloodGroup+",ph no="+this.phNo+",gender="+this.gender+")";
	}
}
