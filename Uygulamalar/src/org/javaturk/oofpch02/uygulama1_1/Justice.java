package org.javaturk.oofpch02.uygulama1_1;

public abstract class Justice {

	public abstract String whoProvideJustice();

	public String howProvideJustice() {
		return whichPunisment();
	};

	public String whichPunisment() {
		return "do not take any punisment";
	}


}
