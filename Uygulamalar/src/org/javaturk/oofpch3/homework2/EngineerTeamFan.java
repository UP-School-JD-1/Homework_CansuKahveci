package org.javaturk.oofpch3.homework2;

public class EngineerTeamFan extends Engineer implements TeamFan {

	String teamName;

	EngineerTeamFan(String name, String lastName, int age, String branch, String teamName) {
		super(name, lastName, age, branch);
		this.teamName = teamName;

	}

	@Override
	public void goGame() {
		System.out.println("EngineerTeamFan can go area for game");

	}

	@Override
	public void supportPlayer() {
		System.out.println("EngineerTeamFan can support players");
		if(teamName == "Beşiktaş") {
			cheerTeam();	
		}
		

	}

	@Override
	public void watchMatch() {
		System.out.println("EngineerTeamFan can watch match on TV or in area");

	}

	private void cheerTeam() {
		System.out.println("Yıllar ne kadar uzun olursa olsun, sevdamız daima sonsuz..");
	}

}
