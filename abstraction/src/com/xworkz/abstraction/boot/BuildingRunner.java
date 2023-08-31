package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.Building;
import com.xworkz.abstraction.app.Floor;
import com.xworkz.abstraction.app.Piller;

public class BuildingRunner {

	public static void main(String[] args) {

		Piller piller = new Floor();
		Building building = new Building();

		building.setPiller(piller);
		building.build();
	}

}
