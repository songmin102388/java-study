package JAVA.Student;

import java.util.Scanner;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int tot;
	private float avg;
	private Scanner sc=new Scanner(System.in);
	
	public Student() {
		System.out.print("이름=");
		this.name=sc.nextLine();
		System.out.println("국어=");
		this.kor=sc.nextInt();
		System.out.println("영어=");
		this.eng = sc.nextInt();
		System.out.println("수학=");
		this.math =sc.nextInt();
		this.tot  = kor +eng + math;
		this.avg=(float)tot/3;		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public float getAvg() {
		return avg;
	}

	public void setAvg(float avg) {
		this.avg = avg;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}
	
	public void disp() {
		System.out.println(name+ " " + kor+ " " + eng + " "+ math + " " + tot+" " + avg);
	}

}
