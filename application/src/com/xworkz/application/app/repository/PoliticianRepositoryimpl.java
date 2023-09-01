package com.xworkz.application.app.repository;

public class PoliticianRepositoryimpl implements PoliticianRepository {
	private String[] names = new String[TOTAL_NUM];
	private int position;

	@Override
	public void list(String name) {
		System.out.println("invoke list in PoliticianRepositoryimpl");
		if (position < TOTAL_NUM) {
			this.names[position] = name;
			System.out.println("name " + name + "at positiom" + position);
			this.position++;
		} else {
			System.err.println("no sapce for the politician");
		}
	}

}
