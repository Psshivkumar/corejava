package com.tooth.comp;

public class Building {

	
	public Floor[] floors;
	  public Lift[] lifts;
	  public Building(Floor[] floors,Lift[] lifts) {
		  this.floors=floors;
		  this.lifts=lifts;
	  }
	  public void printInfo() {
		  for(int i=0;i<this.floors.length;i++) {
			  Floor ref=this.floors[i];

			  ref.printInfo();
		  }
		  for(int i=0;i<this.lifts.length;i++) {
			  Lift ref1=this.lifts[i];

			  ref1.printInfo();
		  }
	  }
}
