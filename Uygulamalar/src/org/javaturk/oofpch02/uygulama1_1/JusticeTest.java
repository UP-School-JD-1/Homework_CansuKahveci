package org.javaturk.oofpch02.uygulama1_1;

public class JusticeTest {

	public static void main(String arg[]) {

		String s1 =  God.getInstance().whoProvideJustice(); //using singleton
		
//		Runtime da neden hata almıyoruz?
//		God god = new God();
		
		System.out.println(s1);
		System.out.println(God.getInstance().whichPunisment()); // take metot super class
		System.out.println(God.getInstance().howProvideJustice());
		
		Judge judge = new Judge();
		System.out.println(judge.whoProvideJustice());
		System.out.println(judge.howProvideJustice());
		System.out.println("Punisment: " + judge.whichPunisment());
		
		
		
	}
}
