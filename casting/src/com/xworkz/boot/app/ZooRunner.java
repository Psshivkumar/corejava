package com.xworkz.boot.app;

public class ZooRunner {

	public static void main(String[] args) {

		Zoo zoo = new Zoo();
		Zoo state = new StateZoo();
		Zoo nation = new NationalZoo();
		Zoo zooutil = new ZooUtil();

		StateZoo stateZoo = (StateZoo) state;
		stateZoo.tiger();
		stateZoo.has();
		ZooUtil util=(ZooUtil) zooutil;
		util.testing();

	}

}
