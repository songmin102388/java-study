package cote.exam1105;

public class BankAccount {
	private String name;
	private String accountNumber;
	private int balance;
	
	public BankAccount(String name, String accountNummber) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance=0;
	}
	
	public BankAccount(String name, String accountNummber,int balace) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance=balance;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdrawal(int amount) {
		int finalAmount = amount > balance ? balance:amount;
		balance -= finalAmount;
		return finalAmount;
	}
	

}
