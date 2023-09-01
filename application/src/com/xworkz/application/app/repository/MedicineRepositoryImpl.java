package com.xworkz.application.app.repository;

public class MedicineRepositoryImpl implements MedicineRepository {
	private int position;
	private String[] medicines = new String[NO];

	@Override
	public void medicine(String med) {
		System.out.println("invoke mediciene in MedicineRepositoryImpl ");
		if (position < NO) {
			this.medicines[position] = med;
			System.out.println("medicine " + med + "at position " + position);
			this.position++;
		} else {
			System.err.println("no place for medicine");
		}
	}

}
