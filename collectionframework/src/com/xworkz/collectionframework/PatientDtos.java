package com.xworkzcollectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Patient {

	public static void main(String[] args) {

		List<PatientDto> dtos = new ArrayList<PatientDto>();
		dtos.add(new PatientDto(1, "prema", 23, "Davangere", BloodGroup.ABnegative, 123456678l, Gender.female));
		dtos.add(new PatientDto(2, "shivu", 22, "bengalore", BloodGroup.Opositive, 8217535708l, Gender.male));
		dtos.add(new PatientDto(3, "satish", 24, "harihara", BloodGroup.ABpositive, 2345635708l, Gender.male));
		dtos.add(new PatientDto(4, "sonu", 24, "Davangere", BloodGroup.Opositive, 98764708l, Gender.female));

		for (PatientDto patientDto : dtos) {
			System.out.println(patientDto);

		}

	}

}
