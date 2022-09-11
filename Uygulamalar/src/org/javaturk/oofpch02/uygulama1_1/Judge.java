package org.javaturk.oofpch02.uygulama1_1;

public class Judge extends Justice {

	@Override
	public String whoProvideJustice() {
		return "Judge";
	}

	@Override
	public String howProvideJustice() {
		System.out.println("Judge decide that punisment : ");
		return super.howProvideJustice();
	}

	@Override
	public String whichPunisment() {
		String str = "living with homeless at the park for a week";
		return str;
	}
	
	public String Info() {
		return "The judge is crazy one,\n he/she decides same punishment for all guilty people :) ";
	}
	

}
