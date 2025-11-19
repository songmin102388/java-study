package JAVA.Book;

import java.util.ArrayList;
import java.util.Scanner;

import JAVA.Student.Student;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Book> books= new ArrayList<Book>();
		while(true){
			System.out.println("1. 도서등록 2. 전체목록 3. 대여 4. 반납 5. 종료");
			System.out.println("선택: ");
			String sel = sc.nextLine();
			
			if(sel.equals("1")) {
				books.add(new Book());
			}
			
			else if (sel.equals("2")) {
				System.out.println("제목  / 저자 / 상태");
				for(Book b: books)b.disp();
			}
			
			else if(sel.equals("3")) {
				System.out.println("대여할 책 제목:");
				String name = sc.nextLine();
				for(Book b : books) {
					if(b.getTitle().equals(name)) {
						b.rentBook();
						break;
					}
				}
			}
			
			else if(sel.equals("4")) {
				System.out.println("반납할 책 제목:");
				String name = sc.nextLine();
				for(Book b:books) {
					if(b.getTitle().equals(name)) {
						b.returnBook();
						break;
					}
				}
			}
			
			else if(sel.equals("5")) {
				System.out.println("프로그램 종료.");
				break;
			}
			
			else {
				System.out.println("잘못 입력했습니다.");
			}
		}
	}
}
