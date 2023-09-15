package com.xworkz.assignment;

import java.util.Scanner;

public class SortingDesc {
	

		 public static void main(String[] args) {
		  int a[]=new int[4];
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("enter the num");
		  for(int k=0;k<4;k++) {
		   a[k]=scanner.nextInt();
		  }
		  System.out.println("numbers  are...");
		  for(int i=0;i<4;i++) {
		   for(int j=i+1;j<4;j++) {
		    
		    if(a[i]<a[j]) {
		     int temp=0;
		     temp=a[i];
		     a[i]=a[j];
		     a[j]=temp;
		    }
		    
		   }
		   System.out.println(a[i]);
		   
		  }
		 }
		}
