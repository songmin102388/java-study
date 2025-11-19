package JAVA.MyPoint;

public class Rect extends MyPoint{
	private int w;
	private int h;
	public Rect() {
		System.out.print("w=");
		this.w= Integer.parseInt(sc.nextLine());
		System.out.print("h=");
		this.h= Integer.parseInt(sc.nextLine());
	}
	public void disp() {
		super.disp();
		System.out.println("푹 = " + this.w + ", 높이 = " + this.h);
		System.out.println();
	}

}
