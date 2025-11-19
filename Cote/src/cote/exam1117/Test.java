package cote.exam1117;

public class Test {
	private int value;
	
	public void setValu(int value) { this.value = value;}
	public int getValue() { return value; }
	
	public void merge(Test other) {
		this.value = this.value + other.value;          //other.getValue();
	}

}
