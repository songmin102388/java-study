package cote.exam1015;

public class MomPizza extends Pizza{
	
	MomPizza() {
		this("M");
	}
	
	MomPizza(String size){
		this.size =size;
		this.name = "엄마 피자";
		prices = new int[] {1000000, 2000000, 4444444};
	}

}
