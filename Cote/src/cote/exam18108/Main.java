package cote.exam18108;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		String input  = scanner.nextLine();
		String[] strs = input.split(" "); // 문자열 나누기
		
		int num = Integer.parseInt(strs[0]); // 문자열 정수로 변환하기	
		
		
		System.out.println(num - 544+1);
		
	}
}