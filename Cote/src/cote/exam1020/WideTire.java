package cote.exam1020;

public class WideTire extends Tire{
	public int width;
	
	public WideTire(String model, int maxroll, int width) {
		super(model,maxroll);
		this.width = width;
	}
}
