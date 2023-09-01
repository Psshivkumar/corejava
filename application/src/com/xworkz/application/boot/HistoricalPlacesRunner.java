package com.xworkz.application.boot;

import com.xworkz.application.app.repository.HistoricalPlacesRepository;
import com.xworkz.application.app.repository.HistoricalPlacesRepositoryimpl;

public class HistoricalPlacesRunner {

	public static void main(String[] args) {

		HistoricalPlacesRepository repository = new HistoricalPlacesRepositoryimpl();
		repository.name("belur");
		repository.name("halebeedu");
		repository.name("badami");
		repository.name("hampi");
		repository.name("aihole");
		repository.name("pattadakallu");
		repository.name("harihara");
		repository.name("shringeri");
		repository.name("kalasa");
		repository.name("horanadu");
		repository.name("mysore");
		repository.name("mysore");
		repository.name("mysore");

	}

}
