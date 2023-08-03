package com.xworkz.boot.app;

public class BrandRunner {

	public static void main(String[] args) {

		Brand brand = new Brand();
		Brand local = new LocalBrand();
		Brand nation = new NationalBrand();
		Brand dup = new DuplicateBrand();
		Brand inter = new InternationalBrand();
		LocalBrand localBrand = (LocalBrand) local;
		localBrand.lowQuality();
		localBrand.brand();
		BrandUtil brandUtil = new BrandUtil();
		brandUtil.value();

	}

}
