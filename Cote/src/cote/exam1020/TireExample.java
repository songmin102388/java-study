package cote.exam1020;

public class TireExample {

	public static void main(String[] args) {
		Tire[] tires = new Tire[2];
		tires[0] = new WideTire("금호", 100000, 90 );
		tires[1] = new ColorTire("한국", 120000, "red" );
		
		System.out.println(tires[0]);
		System.out.println(tires[1]);
	}

}
