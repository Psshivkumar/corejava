package com.xworkz.task;

public class OttPlatfarm {

	String[] movies = new String[5];
	int index;

	public boolean addMovies(String movieName) {
		System.out.println("inside addMovies(String movieName)");
		boolean isAdded = false;
		if (index < movies.length) {
			if (movieName != null) {
				boolean exist = checkMovie(movieName);
				if (exist == false) {
					System.out.println("validation is correct, u can procced");

					movies[index++] = movieName;
					isAdded = true;

					System.out.println(movieName + " mavie added");
				} else {
					System.out.println("movie already exist");
				}

			} else {
				System.out.println("movie name is null, please provide valid data");
			}
		} else {
			System.out.println("no space to add movie");
		}
		return isAdded;

	}

	public void getMovie() {
		for (int index = 0; index < movies.length; index++) {

			System.out.println(movies[index]);
		}

	}

	public boolean checkMovie(String movie) {
		boolean exist = false;
		for (int i = 0; i < movies.length; i++) {

			if (movies[i] == movie) {
				exist = true;
			}
		}
		return exist;
	}

}
