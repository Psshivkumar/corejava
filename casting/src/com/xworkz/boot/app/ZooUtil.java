package com.xworkz.boot.app;

public class ZooUtil extends Zoo {

	public int k;

	public static void testing() {
		Zoo zoo = new Zoo();

		Zoo statezoo = new StateZoo();

		Zoo nationalZoo = new NationalZoo();

		if (nationalZoo instanceof StateZoo) {
			StateZoo stateZoo2 = (StateZoo) nationalZoo;
		}

	}

}
