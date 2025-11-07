package cote.exam7777;

public class BankAccount {
	private String name;
	private int balance;
	private int accountNumber;
	
	public BankAccount(String name, int balance) {
		this.name = name;
		this.balance = 0;
		
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
}
