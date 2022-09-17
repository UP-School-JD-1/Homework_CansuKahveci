package org.javaturk.oofpch03.homework2;

public class EngineerJavaEnthusiastInstrumentPlayer extends Engineer implements JavaEnthusiast, InstrumentPlayer {

	EngineerJavaEnthusiastInstrumentPlayer(String name, String lastName, int age, String branch) {
		super(name, lastName, age, branch);
	}

	public void playInstrumentPlayer(String ınstrument) {
		System.out.println("EngineerJavaEnthusiastInstrumentPlayer play " + ınstrument);

	}

	@Override
	public void playInstrumentPlayer() {
		System.out.println("EngineerJavaEnthusiastInstrumentPlayer can play ınstrument");

	}

	@Override
	public void rentStudio() {
		System.out.println("EngineerJavaEnthusiastInstrumentPlayer can rent Studio");

	}

	@Override
	public void followNote() {
		System.out.println("EngineerJavaEnthusiastInstrumentPlayer can follow notes and play ınstruments");

	}

	@Override
	public void writeCode() {
		System.out.println("EngineerJavaEnthusiastInstrumentPlayer can write Code");

	}

	@Override
	public void bePartOfProject() {
		System.out.println("EngineerJavaEnthusiastInstrumentPlayer can be part of projects");
	}

}
