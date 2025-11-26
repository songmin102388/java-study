package cote.exam1124;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		int[] values = {1,3,5,7,9};
		try {
			int index = getIndex();
			System.out.println(values[index]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(values[0]);
		}
		catch(InputMismatchException e) {
			System.out.println(values[0]);
		}
		finally {
			System.out.println("종료");
		}
	}

	private static int getIndex() throws InputMismatchException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("인덱스를 선택하세요");
		return 0;
	}

}
