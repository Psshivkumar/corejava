
public class Gadget {
	
	public void item() {
		System.out.println("invoking item in Gadget");
		item("laptop");
	
		
	}
	
	public void item(String name) {
		System.out.println("invoking String method in Gadget");
		System.out.println(name);
		
	}
	public void item(String name,double price) {
		System.out.println("invoking String,double method in Gadget");
		System.out.println(name);
		System.out.println(price);
		//item(price,name);
		

		
	}
	public void item(double price,String name) {
		System.out.println("invoking double,String method in Gadget");
		System.out.println(name);
		System.out.println(price);
		item(name,price);
		

		
	}


}
