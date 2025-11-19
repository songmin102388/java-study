package JAVA.MyPoint;

public class Mmain {

	public static void main(String[] args) {
		MyPoint[] mp = new MyPoint[10];
		for (int i= 0;i<mp.length;i++) {
			System.out.println();
			System.out.println("1. 원 2. 사각형 3.보기 4. 종");
			int x = Integer.parseInt(MyPoint.sc.nextLine());
			if (x==1) {
				mp[i] = new Circle();
			}else if (x==2) {
				mp[i] = new Rect();
			}else if (x==3) {
				System.out.println();
				System.out.println("===보기===");
				for (int a=0; a<i;a++) {
					mp[a].disp();
				}
				System.out.println("===보기===");
				System.out.println();
				i--;
				// 보기 시에는 값을 입력한 것이 아니므로 i의 증가된 값을 줄인다.
			} else if (x==4) {
				System.out.println("프로그램을 종료합니다.");
				System.out.println(0);
			} else {
				System.err.println("잘못 입력하셨습니다.");
			}
		}
		System.out.println();
		System.out.println("수고 하셨습니다.");

	}

}
