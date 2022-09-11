package org.javaturk.oofpch02.uygulama1_2;

public class Animal extends Living {

	Boolean pet;

	void IsPet(Boolean pet) {
		this.pet = pet;
		if (pet == true) {
			loveMore();
		}
	}

}