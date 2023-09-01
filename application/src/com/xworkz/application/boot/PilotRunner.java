package com.xworkz.application.boot;

import com.xworkz.application.app.repository.PilotRepository;
import com.xworkz.application.app.repository.PilotRepositoryImpl;

public class PilotRunner {

	public static void main(String[] args) {

		PilotRepository repository = new PilotRepositoryImpl();
		repository.pilot("p1");
		repository.pilot("p2");
		repository.pilot("p3");
		repository.pilot("p4");
		repository.pilot("p5");
		repository.pilot("p6");
		repository.pilot("p7");
		repository.pilot("p8");
		repository.pilot("p9");
		repository.pilot("p10");
		repository.pilot("p11");

	}

}
