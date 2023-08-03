package com.xworkz.boot.app;

public class ChacolateRunner {

	public static void main(String[] args) {

		Chacolate chacolate=new Chacolate();
		Chacolate dark=new DarkChacolate();
		Chacolate caramel=new Caramel();
		DarkChacolate darkChacolate=(DarkChacolate) dark;
		darkChacolate.made();
		darkChacolate.creram();
		Caramel caramel2=(Caramel) caramel;
		caramel2.taste();
		caramel2.made();
		ChacolateUtil chacolateUtil=new ChacolateUtil();
		chacolateUtil.test();
		
	}

}
