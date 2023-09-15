package com.xworkz.crud.app;

public class OttPlatform {
	String[] movies = new String[4];
	int index;

	public boolean moviesName(String movie) {
		boolean isAdded = false;
		System.out.println("invoke moviesName in ottplatform");
		if (index < movies.length) {

			if (movie != null) {
				boolean exist = checkIfMovieExist(movie);
				if (exist == false) {
					System.out.println("validation is proper, u can proceed");

					movies[index++] = movie;
					isAdded = true;
					System.out.println(movie + "  movie is added succesfully");
				} else {
					System.out.println(movie +"  movie is already exists");
				}

			} else {

				System.out.println("movie is null");
			}
		} else {
			System.out.println("no space to add movie");
		}
		return isAdded;

	}

	public void getMovies() {

		for (int index = 0; index < movies.length; index++) {

			System.out.println(movies[index]);
		}
	}

	public boolean checkIfMovieExist(String movieName) {
		boolean exist = false;
		for (int index = 0; index < movies.length; index++) {
			if (movies[index] == movieName) {
				exist = true;

			}
		}
		return exist;

	}

}
