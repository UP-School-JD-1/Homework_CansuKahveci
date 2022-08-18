package org.javaturk.ch8.homework.question2.cp13.question1;

public enum BookType {
	ACTION_AND_ADVENTURE ("Action and Adventure"),
	ROMANTIC ("Romantic"), 
	HISTORICAL_FINCTION ("Historical Finction"),
	HORROR ("Horror"),
	DETECTIVE_AND_MYSTERY ("Detective and Mystery");

	private String description;


	private BookType(String description) {
		this.description = description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription(String description) {
		return this.description;
	}

}
