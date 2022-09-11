package org.javaturk.oofpch02.uygulama1_2;

public interface Love {

	void love();

	static void describe(String str) {
		System.out.println(str);
	}

	private static void definition(String def) {
		System.out.print("Definition : " + def);

	}
}
