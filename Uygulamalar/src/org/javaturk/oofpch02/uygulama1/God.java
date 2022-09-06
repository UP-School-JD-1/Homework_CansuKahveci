package org.javaturk.oofpch02.uygulama1;

public class God extends Justice {

	private static God god = new God();

//	hata veriyor, private tanımlayamıyorum?
//	private static God() {
//		System.out.print("singleton");
//	}

	public static God getInstance() {
		return god;
	}

	@Override
	public String whoProvideJustice() {
		return "God";
	}

	@Override
	public String howProvideJustice() {
		String str = "Naturally";
		return str;
	}

}
