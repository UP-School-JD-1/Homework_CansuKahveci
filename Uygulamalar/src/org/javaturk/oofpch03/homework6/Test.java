package org.javaturk.oofpch03.homework6;

public class Test {

	public static void main(String[] args) {
		
		Location location1 = new Location("A1", "Mersin");
//		OldGood oldGood = new OldGood("Adana" , "0503 nolu bilgisayar");
		Product product = new Product("SKU123", "Süt", 1.8, 12, "Mersin");
		System.out.println(product.getPrice());
		
	}

}
