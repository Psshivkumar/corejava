package com.gar;

import com.gar.mech.Mechanic;

public class Garage {

	public Mechanic mechanic;
    public void coating() {
     System.out.println("garage floor coating");
     if(mechanic!=null) {
      mechanic.repair();
     }
    }
    public void design() {
     System.out.println("design the garage");
     if(mechanic!=null)
     {
      mechanic.washing();
     }
    }
}
