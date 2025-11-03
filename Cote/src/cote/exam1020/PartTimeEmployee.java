package cote.exam1020;

public class PartTimeEmployee extends Employee {
	private int hourlyRate;
	private int workHours;

	public PartTimeEmployee(String name, String employeeId, int hourlyRate, int workHours) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.workHours = workHours;
	}

	@Override
	public int calculatePay() {
		return hourlyRate * workHours;
	}

}
