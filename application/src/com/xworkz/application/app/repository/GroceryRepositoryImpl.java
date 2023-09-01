package com.xworkz.application.app.repository;

public class GroceryRepositoryImpl implements GroceryRepository {

	private String[] groceries = new String[TOTAL_ITEMS];
	private int position;

	@Override
	public void save(String grocery) {
		System.out.println("invoke save in GroceryRepositoryImpl ");

		if (position < TOTAL_ITEMS) {

			this.groceries[position] = grocery;
			System.out.println("Stored " + grocery + " at position " + position);

			this.position++;
		} else {
			System.err.println("items are full, nio space to store");
		}

	}

}
