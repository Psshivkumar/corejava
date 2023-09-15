package com.xworkz.application.app.repository;

public class DummyTester {

	public DummyTester() {

		System.out.println("runninb dummytestr");
	}

	public void dummy() {
		System.out.println("invoke method");
	}

	{
		System.out.println("invoke init block");
	}
	static {
		System.out.println("invoke Static block");
	}
	{
		System.out.println("invoke 1 init block");
	}
	{
		System.out.println("invoke 2 init block");
	}
	{
		System.out.println("invoke 3 init block");
	}
	{
		System.out.println("invoke 4 init block");
	}
	{
		System.out.println("invoke 5 init block");
	}
	static {
		System.out.println("invoke 1 Static block");
	}
	static {
		System.out.println("invoke 2 Static block");
	}
	{
		System.out.println("invoke 5 init block");
	}

	static {
		System.out.println("invoke 2 Static block");
	}

	public static void main(String[] args) {
		System.out.println("invoke main ");
		DummyTester dummyTester = new DummyTester();
		dummyTester.dummy();

	}

}
