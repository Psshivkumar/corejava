package com.xworkz.assignment;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("enter the num");
		  int num=scanner.nextInt();
		  int org_num=num;
		  int rev=0;
		  while(num!=0)
		  {
		   rev=rev*10+num%10;//1
		   num=num/10;//12
		  }
		  
		  System.out.println("num is rev "+rev);
		  if(org_num==rev)
		  {
		   System.out.println("num is palindrome");
		  }
		  else
		  {
		   System.out.println("num is not palindrome");
		  }
		 }

		}


