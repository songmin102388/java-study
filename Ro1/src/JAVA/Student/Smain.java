package JAVA.Student;

import java.util.ArrayList;

public class Smain {

	public static void main(String[] args) {
		ArrayList<Student> li= new ArrayList<Student>();
		
		for(int i=0;i<3;i++) {
			li.add(new Student());
		}
		
		System.out.println("이름 국어 영어 수학 총점 평균");
		for(int i=0;i<li.size(); i++) {
			li.get(i).disp();
		}
	}

}
