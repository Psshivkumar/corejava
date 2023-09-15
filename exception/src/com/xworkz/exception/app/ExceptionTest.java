package com.xworkz.exception.app;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			File file = new File("C:\\Users\\USER\\Desktop\\shivu.pdf");
			if (!file.exists()) {
				file.createNewFile();
			} else {
				System.out.println("file shivu.pdf already exist");
			}
		} catch (IOException ioException) {
			ioException.printStackTrace();

		}

	}

}
