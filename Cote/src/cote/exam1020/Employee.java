package cote.exam1020;

public abstract class Employee {
	protected String name;
	protected String employeeId;
	
	protected Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public abstract int calculatePay();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	

}
