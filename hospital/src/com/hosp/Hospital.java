package com.hosp;

import com.hosp.nur.Nurse;
import com.hosp.nur.patient.Patient;

public class Hospital {

	
	public Nurse nurse;
	 public Doctor docter;
	 public Patient patient;
	 
	 public void caring() {
	  System.out.println("hostipals are used to care the hospital");
	  if(nurse!=null) 
	  {
	   nurse.bedmaking();
	  }
	  if(docter!=null) {
	   docter.treatment();
	  }
	  if(patient!=null) {
	   patient.suffering();
	  }
	 }
	 public void treatment() {
	  System.out.println("patients are treated by a diease");
	  if(nurse!=null) 
	  {
	   nurse.nailcaring();
	  }
	  if(docter!=null) 
	  {
	   docter.checking();
	  }
	  if(patient!=null) 
	  {
	   patient.suffering();
	  
	 }
	 }
}
