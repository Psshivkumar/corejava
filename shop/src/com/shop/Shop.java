package com.shop;

import com.shop.sales.Salesman;

public class Shop {

	public Salesman salesman;
	 public void products() {
	  System.out.println("products can buy in shop");
	  if(salesman!=null) {
	   salesman.selling();
	  }
	  }
	 public void payment() {
	  System.out.println("payments can done");
	  if(salesman!=null) {
	   salesman.marketing();
	  }
	 }

}
