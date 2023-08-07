
public class Plier {

	
		
		public void item() {
			System.out.println("invoking item in plier");
			item("slip-joint");
		
			
		}
		
		public void item(String name) {
			System.out.println("invoking String method in plier");
			System.out.println(name);
			
		}
		public void item(String name,double price) {
			System.out.println("invoking String,double method in plier");
			System.out.println(name);
			System.out.println(price);
			

			
		}
		public void item(double price,String name) {
			System.out.println("invoking double,String method in plier");
			System.out.println(name);
			System.out.println(price);
			item(name,price);
			

			
		}


	}


