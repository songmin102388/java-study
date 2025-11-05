package cote.exam1105;

public class BankAccountExample {

	public static void main(String[] args) {
		BankAccount account = new BankAccount("김자반", "11111112345");
		System.out.println(account);
		
		int currentBalance = account.deposit(10000);
		System.out.println(currentBalance);
		
		int finalAmount = account.withdrawal(4000);
		System.out.println(finalAmount);

	}

}
