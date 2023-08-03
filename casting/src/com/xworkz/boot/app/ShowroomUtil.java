package com.xworkz.boot.app;

public class ShowroomUtil extends Showroom {

	public static void run(Showroom showroom) {
		Showroom showroom2 = new Showroom();

		Showroom mobileShowroom = new MobileShowroom();

		Showroom watchShowroom = new WatchShowroom();

		WatchShowroom watchShowroom2 = new WatchShowroom();
		watchShowroom2.rolex();

		if (mobileShowroom instanceof WatchShowroom) {
			WatchShowroom watchShowroom3 = (WatchShowroom) mobileShowroom;

		}

		if (watchShowroom instanceof MobileShowroom)

		{
			MobileShowroom mobileShowroom2 = (MobileShowroom) watchShowroom;

		}

	}

}
