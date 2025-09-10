package cote.exam14681;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int num = scanner.nextInt();
		int num2 = scanner.nextInt();
		
		if (num>0 &&  num2>0) {
			System.out.println("1");
		} 
		else if(num>0 && num2<0) {
			System.out.println("4");
		}
		else if (num<0 &&num2>0) {
			System.out.println("2");
		}
		else if(num<0 && num2 <0) {
			System.out.println("3");
		}
	}
}