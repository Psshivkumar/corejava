package com.method.over;

public class Umbrella {
	
	public void protect()
	{
		System.out.println("invoke protect in Umbrella");
		protect("rain");
		
	}
	

	public void protect(String from1)
	{
		System.out.println("invoke String method  in Umbrella");
		System.out.println(from1);
	}
	
	public void protect(String from1,String from2)
	{
		System.out.println("invoke String,String method  in Umbrella");
		System.out.println(from1);
		System.out.println(from2);
		
		
	}
	

	public void protect(String from1,String from2,double cost)
	{
		System.out.println("invoke String,String method  in Umbrella");
		System.out.println(from1);
		System.out.println(from2);
		System.out.println(cost);
		protect(from1,from2);

		
	}
	
	
	

}
