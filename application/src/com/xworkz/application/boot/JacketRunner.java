package com.xworkz.application.boot;

import com.xworkz.application.app.repository.JacketRepository;
import com.xworkz.application.app.repository.JacketRepositoryImpl;

public class JacketRunner {

	public static void main(String[] args) {

		JacketRepository repository = new JacketRepositoryImpl();
		repository.jacket("jac1");
		repository.jacket("jac2");
		repository.jacket("jac");
		repository.jacket("jac3");
		repository.jacket("jac4");
		repository.jacket("jac5");
		repository.jacket("jac6");
		repository.jacket("jac7");
		repository.jacket("jac8");
		repository.jacket("jac9");
		repository.jacket("jac10");
		repository.jacket("jac11");

	}

}
