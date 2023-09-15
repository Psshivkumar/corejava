package com.xworkz.crud.app;

public class OttTester {

	public static void main(String[] args) {

		OttPlatform ott = new OttPlatform();
		ott.moviesName(null);
		ott.moviesName("om");
		ott.moviesName("om");
		ott.moviesName("jogi");
		
		ott.getMovies();

	}

}
