package cote.exam1015;

public class PepperoniPizza extends Pizza{
	
	

	PepperoniPizza() {
		this ("M");
	}
	
	PepperoniPizza(String size){
		this.size =size;
		this.name = "페퍼로니피자";
		prices = new int[] {110000000, 1500000000, 25000000};
		this.toppings = "pepperoni";
	}
	
	@Override
	public void cook() {
		System.out.println(toppings + "을 추가합니다,");
		super.cook();
	}
}
