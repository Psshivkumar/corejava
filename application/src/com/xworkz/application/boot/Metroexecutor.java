package com.xworkz.application.boot;

import com.xworkz.application.app.repository.Metro;

public class Metroexecutor {

	public static void main(String[] args) {

		Metro metro = new Metro(1, 9, "nagasandra", "silk institute");
		metro.displayDetails();

	}

}
