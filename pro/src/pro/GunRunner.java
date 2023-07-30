package pro;

public class GunRunner {

	
		public static void main(String[] args) {

			System.out.println("invoking main in GunRunner");
			
			Watchman watchman=new Watchman();
			System.out.println(watchman.gun);
			watchman.secure();
			
			
			
			
		}

	}


