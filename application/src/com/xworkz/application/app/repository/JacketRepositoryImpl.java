package com.xworkz.application.app.repository;

public class JacketRepositoryImpl implements JacketRepository {
	private int position;
	private String[] jacket = new String[JACK_NO];

	@Override
	public void jacket(String jac) {
		System.out.println("invoke jacket in JAcket ");
		if (position < JACK_NO) {

			this.jacket[position] = jac;

			System.out.println("jac " + jac + " at position " + position);
			this.position++;
		} else {
			System.err.println("memory full no space");
		}
	}

}
