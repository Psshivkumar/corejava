package com.xworkz.application.boot;

import com.xworkz.application.app.repository.MedicineRepository;
import com.xworkz.application.app.repository.MedicineRepositoryImpl;

public class MedicineRunner {

	public static void main(String[] args) {

		MedicineRepository repo = new MedicineRepositoryImpl();
		repo.medicine("dolo");
		repo.medicine("anacin");
		repo.medicine("citrigrn");
		repo.medicine("clear chest");
		repo.medicine("calcium tablet");
		repo.medicine("move");
		repo.medicine("isinopril");
		repo.medicine("levothyroxine");
		repo.medicine("atorvastatin");
		repo.medicine("metformin");
		repo.medicine("simvastatin");
		repo.medicine("simvastatin");
		repo.medicine("simvastatin");

	}

}
