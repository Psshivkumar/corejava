package com.xworkz.task;

import java.util.Scanner;

public class Hospital {
	public static void main(String[] args) {
		AmazonPrime am=new AmazonPrime();
		am.addName("prema");
		am.addName("prema");
	    am.addName("shivu");
	
	String patientName;
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the names");
	int index;
	for(int i=0;i<3;i++)
	{
		patientName=scanner.next();
		//System.out.println(patientName);
	}
	
	
	
}
}