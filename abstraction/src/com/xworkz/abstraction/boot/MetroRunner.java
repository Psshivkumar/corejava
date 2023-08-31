package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.Metro;
import com.xworkz.abstraction.app.RailwayBridge;
import com.xworkz.abstraction.app.RouteMap;

public class MetroRunner {

	public static void main(String[] args) {
   
		RouteMap map=new RailwayBridge();
		Metro metro =new Metro();
		metro.setMap(map);
		metro.connect();
	}

}
