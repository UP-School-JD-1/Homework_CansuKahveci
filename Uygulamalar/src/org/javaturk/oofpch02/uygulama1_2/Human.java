package org.javaturk.oofpch02.uygulama1_2;

public class Human extends Living {

	public Boolean IsFamilyMember;

	void Family(Boolean IsFamilyMember) {
		this.IsFamilyMember = IsFamilyMember;
		if (IsFamilyMember == true) {
			super.loveMore();
		} else
			super.love();
	}

}
