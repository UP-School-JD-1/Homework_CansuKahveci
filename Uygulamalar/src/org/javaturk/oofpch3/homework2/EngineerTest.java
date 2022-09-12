package org.javaturk.oofpch3.homework2;

public class EngineerTest {

	public static void main(String arg[]) {

		Engineer engineer1 = new Engineer("Ali", "Taş", 45, "electronic");

		EngineerBloggerParent engBloggerParent1 = new EngineerBloggerParent("Ayşe", "Taş", 46, "Machine");
		EngineerBloggerParent engBloggerParent2 = new EngineerBloggerParent("Cem", "Karaca", 25, "Electronic");
		engBloggerParent1.doSearch();
		engBloggerParent1.writeBlog();

		System.out.println();

		engBloggerParent2.loveKids();
		engBloggerParent2.teachEthic();

		System.out.println();

		EngineerJavaEnthusiastInstrumentPlayer engJavaEntIns1 = new EngineerJavaEnthusiastInstrumentPlayer("John",
				"Depp", 52, "Biomedical");
		engJavaEntIns1.followNote();
		engJavaEntIns1.playInstrumentPlayer();
		engJavaEntIns1.playInstrumentPlayer("Drum");

		System.out.println();

		EngineerTeamFan engTeamFan1 = new EngineerTeamFan("Seda", "Sayım", 62, "Computer", "Beşiktaş");
		engTeamFan1.goGame();
		engTeamFan1.watchMatch();
		engTeamFan1.supportPlayer();

		System.out.println();

		EngineerTeamFan engTeamFan2 = new EngineerTeamFan("Hatice", "Ercan", 35, "Mathematic", "Galatasaray");
	}

}
