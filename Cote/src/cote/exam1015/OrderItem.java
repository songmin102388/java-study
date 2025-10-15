package cote.exam1015;

public class OrderItem{
	public Menu menu;
	public int quantity;
	
	OrderItem() {}
	OrderItem(Menu menu, int quantity){
		this.menu =menu;
		this.quantity =quantity;
		
	}
	
	public int getPrice() {
		return menu.price * quantity;
	}
	

}
