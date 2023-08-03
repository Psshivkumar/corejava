package com.xworkz.boot.app;

public class ChacolateUtil {

	public int quantity;

	public static void test() {
		Chacolate chacolate = new Chacolate();
		Chacolate dark = new DarkChacolate();
		Chacolate caramel = new Caramel();
		if (caramel instanceof DarkChacolate) {
			DarkChacolate darkChacolate = (DarkChacolate) caramel;
		}
	}

}
