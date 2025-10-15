package cote.exam1015;

public class CheesePizza extends Pizza{
	
	CheesePizza() {
		this("M");
	}
	
	CheesePizza(String size){
		this.size =size;
		this.name = "치즈피자";
		prices = new int[] {10000, 15000, 25000};
	}
}
	
