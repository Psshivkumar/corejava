package com.xworkz.abstraction.app;

public class Building {

	private Piller piller;

	public void setPiller(Piller piller) {
		this.piller = piller;
	}

	public void build() {

		System.out.println("build a new floor");
		this.piller.construction();
	}
}
