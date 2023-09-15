package com.xworkz.exception.app;

import java.io.File;
import java.io.IOException;

public class test {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\USER\\Desktop\\shivu.pdf");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
