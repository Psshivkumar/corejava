package com.xworkz.application.boot;

import com.xworkz.application.app.repository.PoliticianRepository;
import com.xworkz.application.app.repository.PoliticianRepositoryimpl;

public class POliticianRuner {

	public static void main(String[] args) {

		PoliticianRepository repository = new PoliticianRepositoryimpl();
		repository.list("Siddaramayya");
		repository.list("modhi");
		repository.list("amith shah");
		repository.list("atal bihariu");
		repository.list("vajapey");
		repository.list("gandhi");
		repository.list("nehru");
		repository.list("s s mallikarjunayya");
		repository.list("upendra");
		repository.list("pradeep eshwar");
		repository.list("pradeep eshwar");


	}

}
