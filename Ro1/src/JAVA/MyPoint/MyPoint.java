package JAVA.MyPoint;

import java.util.Scanner;

public class MyPoint {
	private int x;
	private int y;
	
	protected static Scanner sc;
	static { 
		sc = new Scanner(System.in);
	}
	protected MyPoint() { 
		System.out.print("x=");
		this.x= Integer.parseInt(sc.nextLine());
		System.out.print("y=");
		this.y= Integer.parseInt(sc.nextLine());
	}
	protected void disp() {
		System.out.println();
		System.out.println("점(x,y)=("+x+" , "+y+")");
	}

}
