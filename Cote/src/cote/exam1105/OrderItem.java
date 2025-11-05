package cote.exam1105;

public class OrderItem {
	public Menu menu;
	public int quantity;
	
	
	
	public OrderItem() {}
	public OrderItem(Menu menu, int quantity) {
		this.menu = menu;
		this.quantity= quantity;
	}
	
	public int getPrice() {
		return menu.price * quantity;
	}
}
