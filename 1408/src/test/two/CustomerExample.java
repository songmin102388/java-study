package test.two;

public class CustomerExample {

	public static void main(String[] args) {
		Customer cust1 = new Customer();
		Customer cust2 = new Customer();
		
		cust1.point = 0;
		cust2.point =100;
		
		
		cust1.point = 50;
		System.out.println(cust1.point);
		
		cust2.point =100 - 50;
		System.out.println(cust2.point);
		
		cust2.point =200;
		System.out.println(cust2.point);
		
		
	}

}
