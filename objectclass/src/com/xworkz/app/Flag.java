package com.xworkz.app;

public class Flag {

	private int colors;
	private String nation;
	private double cost;

	public Flag() {
		super();
	}

	public Flag(int colors, String nation, double cost) {
		super();
		this.colors = colors;
		this.nation = nation;
		this.cost = cost;
	}

	@Override
	public String toString() {
		
		System.out.println("invok to string in flag");
		return "colors: "+colors+ " nation: "+nation+" cost: "+cost;

	}

}
