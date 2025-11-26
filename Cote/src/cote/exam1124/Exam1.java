package cote.exam1124;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int[] values  = {1,3,5,7,9};
		Scanner scanner = new Scanner(System.in);
		System.out.println("인텍스를 선택하세요");
		try {
			int index = scanner.nextInt();
			System.out.println(values[index]);
		}
		catch(InputMismatchException e){
			System.out.println("숫자 써라 ㅅㅂ년아");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ㅂㅅ이야?? 범위 안에서 입력해..");
			
		}
		scanner.close();
		
	}
}
