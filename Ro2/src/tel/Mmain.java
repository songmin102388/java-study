package tel;

import java.util.Scanner;

public class Mmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PhoneDAO dao = new PhoneDAO();

		while (true) {
			System.out.println("\n[전화번부 메뉴]");
			System.out.println("1. 등록 2. 수정 3. 삭제 4. 조회 5. 종료 : ");
			int menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.println("이름: ");
				String name = sc.nextLine();
				System.out.println("전화번호: ");
				String phone = sc.nextLine();
				dao.insert(name, phone);
				break;

			case 2:
				System.out.println("수정할 이름: ");
				String name3 = sc.nextLine();
				System.out.println("새 전화번호: ");
				String phone3 = sc.nextLine();
				dao.update(name3, phone3);
				break;

			case 3:
				System.out.println("삭제할 이름: ");
				String name2 = sc.nextLine();
				dao.delete(name2);
				break;

			case 4:
				dao.selectAll();
				break;

			case 5:
				System.out.println("프로그램 종료.");
				sc.close();
				return;

			default:
				System.out.println("잘못된 선택입니다.");
			}
		}
	}
}
