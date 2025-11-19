package JAVA.MyPoint;

public class Circle extends MyPoint{
	private int r;
	public Circle() {
		System.out.print("r=");
		this.r= Integer.parseInt(sc.nextLine());
	}
	public void disp() {
		super.disp();
		System.out.println("반지름 r = " + this.r);
		System.out.println();
	}
}
