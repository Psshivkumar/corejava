package com.xworkz.application.boot;

import com.xworkz.application.app.repository.PatientRepository;
import com.xworkz.application.app.repository.PatientRepositoryImpl;

public class PatientRunner {

	public static void main(String[] args) {

		PatientRepository repositoryImpl = new PatientRepositoryImpl();
		repositoryImpl.type("fever");
		repositoryImpl.type("cold");
		repositoryImpl.type("flue");
		repositoryImpl.type("hand broken");
		repositoryImpl.type("leg broken");
		repositoryImpl.type("cancer");
		repositoryImpl.type("dengue");
		repositoryImpl.type("HIV");
		repositoryImpl.type("pnuemonia");
		repositoryImpl.type("decentry");
		repositoryImpl.type("decentry");
		repositoryImpl.type("decentry");
		repositoryImpl.type("decentry");

	}

}
