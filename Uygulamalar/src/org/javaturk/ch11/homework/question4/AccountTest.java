package org.javaturk.ch11.homework.question4;

public class AccountTest {

	public static void main(String[] args) {

		Account account1 = new Account();
		Account account2 = new Account();

		account1.setBalance(15000.23);
		account2.setBalance(1785655.45);

		double BalanceOfAccount1 = account1.getBalance();
		double BalanceOfAccount2 = account2.getBalance();

		System.out.println(BalanceOfAccount1);
		System.out.println(BalanceOfAccount2);

		System.out.println("Fee is static variable in Account class: " + Account.fee);

		System.out.println("\nWe use Intelligent Constructor");
		Account account3 = new Account(5000.8);
		System.out.println("Account3 balance : " + account3.getBalance());
		System.out.println("Fee is final static variable in Account class: " + Account.fee);
//		account3.setFee(2);
		System.out.println("Current fee : " + account3.getFee());

		System.out.println();

////		referansını nasıl yazırabilirim?
//		System.out.println(account3.getFee());

		AccountClient accountClient1 = new AccountClient();
		AccountClient accountClient2 = new AccountClient();
		AccountClient accountClient3 = new AccountClient("Cansu", "Kahveci", account3);

		accountClient1.name = "Hatice";
		accountClient1.lastName = "Kahveci";
		accountClient1.account = account1;

		account1.setAccountclient(accountClient1);
		account3.setAccountclient(accountClient3);

		accountClient1.printInfo(account1);
		System.out.println("Use depositMoney Metot");
		accountClient1.depositMoney(account1, 600);
		accountClient1.printInfo(account1);
		System.out.println("------------");
		accountClient1.printInfo(account1);
		accountClient3.printInfo(account3);
		System.out.println("Use trasferMoney Metot");
		accountClient1.tranferMoney(500, account1, account3);
		accountClient1.printInfo(account1);
		accountClient3.printInfo(account3);
	}

}
