package com.xworkz.boot.app;

public class ShowroomRunner {

	public static void main(String[] args) {

		
		
		Showroom showroom=new WatchShowroom();
		
		WatchShowroom watchShowroom2=(WatchShowroom) showroom;
		System.out.println(watchShowroom2.location);
		System.out.println(watchShowroom2.price);
		watchShowroom2.rolex();
		watchShowroom2.sell();
		
		Showroom showroom2=new  MobileShowroom();
		
		MobileShowroom mobileShowroom=(MobileShowroom) showroom2;
		mobileShowroom.sell();
		System.out.println(mobileShowroom.cost);
		System.out.println(mobileShowroom.location);
		
		
		ShowroomUtil showroomUtil=new ShowroomUtil();
		showroomUtil.run(showroomUtil);
		
		
		
	}

}
