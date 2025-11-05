package cote.exam1105;
public class OrderExample {

	public static void main(String[] args) {
		
		Menu americano = new Menu("아메리카", 4000);
		Menu bread = new Menu("빵", 3400);
		Menu coco = new Menu("코코", 50000);
		
		OrderItem o1 = new OrderItem(americano,4);
		int price = o1.getPrice();
		System.out.println(price);
		
		OrderItem o2 = new OrderItem(bread,5);
		System.out.println(o2.getPrice());
		
		OrderItem o3 = new OrderItem(coco,10);
		System.out.println(o3.getPrice());

		

	}

}
