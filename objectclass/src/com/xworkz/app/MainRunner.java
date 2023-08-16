package com.xworkz.app;

public class MainRunner {

	public static void main(String[] args) {

		Logo logo = new Logo("tcs", "blue", "ravi", true, 5);
		String ref1 = logo.toString();
		System.out.println(ref1);
		Logo logo2 = new Logo();
		System.out.println(logo2.toString());
		System.out.println("####");

		Karchief karchief = new Karchief();
		Karchief karchief2 = new Karchief(22, "red", 2, "chex", 20, 20, 20);
		System.out.println(karchief.toString());
		System.out.println(karchief2);
		System.out.println("####");
		
		
		Flag flag=new Flag();
		System.out.println(flag.toString());
		Flag flag2=new Flag(3, "india", 20);
		Flag flag3=new Flag(2, "y", 0);
		System.out.println(flag3.toString());
				
		System.out.println(flag2.toString());
		
		System.out.println("+++++++++++");
		
		Cave cave=new Cave();
		Cave cave2=new Cave("amazon", "newyork", "america", 0, false, false, false, false, false, false);
		Cave cave3=new Cave();
		System.out.println(cave.toString());
		System.out.println(cave2.toString());
		System.out.println(cave3.toString());
		
		System.out.println("++++++++=====");
		
		Pendent pendent=new Pendent();
		System.out.println(pendent);
		System.out.println("\n");

		Pendent pendent2=new Pendent("GIVA",false,"Lobster","Sterling Silver","Cubic Zirconia","Cube",925,6,"High",2899,"Giva jewellary");
		System.out.println(pendent2);
		System.out.println("\n");

		Pendent pendent3=new Pendent("NOVA",false,"Ster","Silver Gix Gold","Magnetic","Round",896,6,"Medium",3499,"Nova jewellary");
		System.out.println(pendent3);

	}

}
