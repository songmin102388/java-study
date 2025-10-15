package cote.exam1015;

import java.util.Scanner;

public class OrderExample {

	public static void main(String[] args) {
		Menu[] menus = new Menu[3];
		menus[0] = new Menu("아메리카", 4000);
		menus[1] = new Menu("빵", 3400);
		menus[2] =  new Menu("코코", 50000);
		
		Scanner sc = new Scanner(System.in);
		int menuIndex = sc.nextInt();
		int quantity = sc.nextInt();
		sc.close();
		
		// 사용자가 입력한 메뉴의 수향에 맞는 총 가격 출
		if(menuIndex >=0 && menuIndex <menus.length && quantity > 0) {
			OrderItem o = new OrderItem(menus[menuIndex], quantity);
			System.out.println(o.getPrice());
		}
		
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
