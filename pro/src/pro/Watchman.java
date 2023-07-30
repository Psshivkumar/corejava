package pro;

public class Watchman {

public Gun gun;
	
	
	void secure()
	{
	System.out.println("invoking secure in Watchman");
	if(this.gun!=null) {
	gun.shoot();
	}
		
	}
	

}
	
	

