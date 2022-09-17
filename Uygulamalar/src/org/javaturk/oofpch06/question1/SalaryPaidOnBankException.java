package org.javaturk.oofpch06.question1;

public class SalaryPaidOnBankException extends Exception {

	@Override
	public String getMessage() {
		return "Your salary is more than 7000, you should take it on the bank";
	}
}
