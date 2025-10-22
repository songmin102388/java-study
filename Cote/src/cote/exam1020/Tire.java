package cote.exam1020;

public class Tire {
	private String  model;
	private int maxroll;
	private int rolling;
	
	public Tire(String  model,int maxroll) {
		this.model = model;
		this.maxroll = maxroll;
		this.rolling = rolling;
	}
	
	public boolean roll() {
		rolling +=1;
		if(rolling > maxroll) {
			return false;
		}
		else {
			return true;
		}
	}
}
