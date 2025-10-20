package cote.exam1020;

public class BankAccount {
	private static int count = 0;
	
	private String name;
	private String accountNumber;
	private int balance;
	
	public BankAccount (String name, String accounNumber) {
		this. name = name;
		this.accountNumber  = accountNumber;
		this. balance = 0;
		count++;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int withdrawal(int amount) {
		int finalAmount = amount > balance ? balance:amount;
		balance -= finalAmount;
		return finalAmount;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public BankAccount (String name, String accountNumber,int balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	
	

}
