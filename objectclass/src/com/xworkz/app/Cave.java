package com.xworkz.app;

public class Cave {
	private String forest;
	private String state;
	private String nation;
	private double distance;
	private boolean darkness;
	private boolean lion;
	private boolean snake;
	private boolean bat;
	private boolean insects;
	private boolean frog;

	public Cave() {
		super();
	}

	public Cave(String forest, String state, String nation, double distance, boolean darkness, boolean lion,
			boolean snake, boolean bat, boolean insects, boolean frog) {
		super();
		this.forest = forest;
		this.state = state;
		this.nation = nation;
		this.distance = distance;
		this.darkness = darkness;
		this.lion = lion;
		this.snake = snake;
		this.bat = bat;
		this.insects = insects;
		this.frog = frog;
	}
	
	@Override
	public String toString() {
		System.out.println("invoke tostring in cave");
		return "String";
		
	}
	

}
