package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.Android;
import com.xworkz.abstraction.app.Mobile;
import com.xworkz.abstraction.app.Updates;

public class MobileRunner {

	public static void main(String[] args) {

		Updates updates = new Android();
		Mobile mobile = new Mobile();
		mobile.setUpdates(updates);
		mobile.update();
	}

}
