package com.xworkz.boot.app;

public class BrandUtil extends Brand {
	public String type;

	public static void value() {

		System.out.println("depends on type of brand");
		Brand brand = new Brand();
		Brand local = new LocalBrand();
		Brand nation = new NationalBrand();
		Brand dup = new DuplicateBrand();
		Brand inter = new InternationalBrand();

		if (dup instanceof NationalBrand) {
			NationalBrand nationalBrand = (NationalBrand) dup;
		}

	}

}
