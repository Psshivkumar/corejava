package com.xworkz.application.boot;

import com.xworkz.application.app.repository.ArtistRepository;
import com.xworkz.application.app.repository.ArtistRepositoryimpl;

public class ArtistRunner {

	public static void main(String[] args) {

		ArtistRepository artistRepository = new ArtistRepositoryimpl();
		artistRepository.save("yash");
		artistRepository.save("hasan");
		artistRepository.save("jan 8");
		artistRepository.save("1988");
		artistRepository.save("mysore");
		artistRepository.save("kgf1");
		artistRepository.save("kgf2");
		artistRepository.save("rajahuli");
		artistRepository.save("ramachari");
		artistRepository.save("googly");
		artistRepository.save("googly");
		artistRepository.save("googly");
		artistRepository.save("googly");
		artistRepository.save("googly");
		artistRepository.save("googly");
		artistRepository.save("googly");
		artistRepository.save("googly");
		artistRepository.save("googly");

	}

}
