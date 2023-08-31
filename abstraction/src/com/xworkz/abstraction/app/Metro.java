package com.xworkz.abstraction.app;

public class Metro {

	private RouteMap map;

	public void setMap(RouteMap map) {
		this.map = map;
	}

	public void connect() {
		System.out.println("connect to next staion");
		this.map.estimateRoute();
	}
}
