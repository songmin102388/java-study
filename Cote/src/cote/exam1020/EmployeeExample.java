package cote.exam1020;

public class EmployeeExample {

	public static void main(String[] args) {
		Employee[] emps = new Employee[2];
		emps[0] = new FullTimeEmployee("김자바", "1111", 36000000);
		emps[1] = new PartTimeEmployee("이자바", "1112",36000,50000);
		
		
		for(Employee e: emps) {
			System.out.println(e.getName()+ "-"+e.calculatePay());
		}
		for(int i=0;i<emps.length; i++) {
			System.out.println(emps[i].getName() + "-" + emps[i].calculatePay());
		}

	}

}
