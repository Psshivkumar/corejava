package com.xworkz.application;

import java.util.Scanner;

import com.xworkz.application.hospital.HospitalRepository;
import com.xworkz.application.hospital.impl.AnanyaHospitalRepositoryImpl;
import com.xworkz.application.patient.Patient;

public class HospitalRunner {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Patient");
		int size = sc.nextInt();
		
		//Abstraction
		HospitalRepository hospitalRepository = new AnanyaHospitalRepositoryImpl(size);
		
		for (int i = 0; i < size; i++) {
			Patient patient = new Patient();
			
			
			
			hospitalRepository.savePatient(patient);
			
		}
		
	}
}
