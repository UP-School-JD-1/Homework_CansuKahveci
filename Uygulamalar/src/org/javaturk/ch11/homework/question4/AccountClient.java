package org.javaturk.ch11.homework.question4;

public class AccountClient {

	String name;
	String lastName;
	Account account;

	public AccountClient() {

	};

	public AccountClient(String name, String lastName, Account account) {
		this.name = name;
		this.lastName = lastName;
		this.account = account;
	};

	public double withdraw(Account account, double amountOfMoney) {
		if (amountOfMoney < account.getBalance())
			;
		double balance = account.getBalance();
		balance -= amountOfMoney;
		// set balance değerine bak!!!
		account.setBalance(balance);
		return balance;
	}

	public double depositMoney(Account account, double amountOfMoney) {
		double balance = account.getBalance();
		balance += amountOfMoney;
		account.setBalance(balance);
		return balance;
	}

	public double tranferMoney(double amountOfMoney, Account myAccount, Account trasferAccount) {
		double totalCost = amountOfMoney + Account.fee;
		double myAccountBalance = myAccount.getBalance();
		myAccountBalance -= totalCost;
		myAccount.setBalance(myAccountBalance);

		double transferAccountBalance = trasferAccount.getBalance();
		transferAccountBalance += amountOfMoney;
		trasferAccount.setBalance(transferAccountBalance);

		return myAccountBalance;
	}

	public void printInfo(Account account) {
		System.out.println("Client Info");
		System.out.println("AccountClient: " + name + " " + lastName + "\nBalance : " + account.getBalance());
		System.out.println();
	}

}
