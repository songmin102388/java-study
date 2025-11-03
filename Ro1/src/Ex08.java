import java.util.ArrayList;
import java.util.Scanner;

class Sj{
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	float avg;
	Sj(){
		Scanner sc=new Scanner(System.in);
		System.out.println("이름=");
		this.name =  sc.nextLine();
		
		System.out.println("국어=");
		this.kor = sc.nextInt();
		
		System.out.println("영어=");
		this.eng = sc.nextInt();
		
		System.out.println("수학=");
		this.math=sc.nextInt();
		
		this.tot = kor+eng+math;
		this.avg =(float)tot/3;
	}
	void disp() {
		System.out.println(name +kor + eng + math + tot + avg);
	}
	
}



public class Ex08 {

	public static void main(String[] args) {
		
		Sj[] sj = new Sj[3];
		for(int i=0;i<sj.length;i++) {
			sj[i] = new Sj();
		}
		System.out.println("이름 국어 영어 수학 총점 평균");
		for(int i=0;i<sj.length;i++) {
			sj[i].disp();
		}
		

	}

}
