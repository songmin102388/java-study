package cote.exam1105;

public abstract class Employee {
	public String name;
	public String employeeId;
	public abstract int calculatePay();
	
	
	public Employee (String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

}
