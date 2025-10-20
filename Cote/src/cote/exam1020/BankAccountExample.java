package cote.exam1020;


public class BankAccountExample {
	

	public static void main(String[] args) {
		BankAccount account = new BankAccount("김자반", "11111112345");
		System.out.println(account.getBalance());
		
		int currentBalance = account.deposit(10000);
		System.out.println(currentBalance);
		System.out.println(account.getBalance());
		
		int finalAmount = account.withdrawal(5000);
		System.out.println(finalAmount);
		
		finalAmount = account.withdrawal(7000);
		System.out.println(finalAmount);
		System.out.println(account.getBalance());
		
		System.out.println(BankAccount.getCount());
		BankAccount account2 = new BankAccount("이파이", "12345678");
		System.out.println(BankAccount.getCount());
	}

}
