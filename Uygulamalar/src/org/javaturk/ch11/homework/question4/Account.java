package org.javaturk.ch11.homework.question4;

public class Account {

	private double balance;
	final static double fee = 4.5;
//	static double fee = 4.5;

//	accountclient a gerek yok, pakete erişim kontolü yaparak sarmalama mı yaptık? 
//	private AccountClient accountclient;

	public Account() {

	};

//	public Account(double balance, double fee) {
//		this.fee = fee;
//		this.balance = balance;
//	}
	
	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	};

//	public void setFee(double fee) {
//		this.fee = fee;
//	};

	public double getFee() {
		return fee;
	};

}