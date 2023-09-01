package com.xworkz.application.app.repository;

public class PilotRepositoryImpl implements PilotRepository {
	private int position;
	private String[] pilots = new String[PILOT];

	@Override
	public void pilot(String name) {
		System.out.println("involr pilot in Pilotrepoimpl");
		if (position < PILOT) {
			this.pilots[position] = name;
			System.out.println("name " + name + " at position " + position);
			this.position++;

		} else {
			System.err.println("no space");
		}
	}

}
