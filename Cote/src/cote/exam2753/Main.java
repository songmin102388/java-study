package cote.exam2753;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String input  = scanner.nextLine();
		String[] strs = input.split(" "); // 문자열 나누기
		
		int num = Integer.parseInt(strs[0]); // 문자열 정수로 변환하기	
		
		
		if (num%4==0 && num%100 != 0 ) {
			System.out.println("1");
		}
		else if (num%4 ==0 && num%400==0) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}