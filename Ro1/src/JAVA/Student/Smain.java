package JAVA.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Smain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Student> li= new ArrayList<Student>();
		while(true) {
			System.out.println("1. 입력 2. 출력 3. 종료 : ");
			int s=sc.nextInt();
			if(s==1) {
				li.add(new Student());
			} else if(s==2) {
				System.out.println("이름 국어 영어 수학 총점 평균");
				for(int i=0;i<li.size(); i++) {
					li.get(i).disp();
				}
			} else if (s==3) {
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
					
		}
		System.out.println("프로그램종료.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		ArrayList<Student> li= new ArrayList<Student>();
//		
//		for(int i=0;i<3;i++) {
//			li.add(new Student());
//		}
//		
//		System.out.println("이름 국어 영어 수학 총점 평균");
//		for(int i=0;i<li.size(); i++) {
//			li.get(i).disp();
//		}
	}

}
