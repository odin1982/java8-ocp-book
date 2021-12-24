package org.book.advancedClassDesign._01;

interface Account {
	public default String getId() {
		return "0000";
	}
}

interface PremiumAccount extends Account {
	public String getId();
}

public class BankAccount implements PremiumAccount{
	public static void main(String[] args) {
		Account acct = new BankAccount();
	}
}

//Notes:
//	- BankAccount debe implementar los métodos de la interface PremiumAccount
	