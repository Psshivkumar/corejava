package com.xworkz.application.app.repository;

public class HistoricalPlacesRepositoryimpl implements HistoricalPlacesRepository {
	private String names[] = new String[TOTAL_PLACES];
	private int position;

	@Override
	public void name(String name) {
		System.out.println("invoke name in HistoricalPlacesRepositoryimpl");
		if (position < TOTAL_PLACES) {

			this.names[position] = name;
			System.out.println("name " + name + " at position " + position);
			this.position++;
		} else {
			System.err.println("no space to fil the names");
		}
	}

}
