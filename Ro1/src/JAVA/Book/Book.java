package JAVA.Book;

import java.util.Scanner;

public class Book {
	private String title;
	private String author;
	private boolean rented;  // true : 대여중 | false : 보유중
	private Scanner sc =new Scanner(System.in);
	
	public Book() {
		System.out.println("책 제목: ");
		this.title = sc.nextLine();
		System.out.println("저자: ");
		this.author=sc.nextLine();
		this.rented = false; // 처음엔 항상 '보유중'
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public boolean isRented() {
		return rented;
	}
	
	public void rentBook() {
		if(rented) System.out.println("이미 대여 중인 책입니다.");
		else {
			rented=true;
			System.out.println(title+ "대여 완료!");
		}
	}
	
	public void returnBook() {
		if(!rented) System.out.println("이미 반납된 책입니다.");
		else {
			rented = false;
			System.out.println(title+"반납 완료!");
		}
	}
	
	public void disp() {
		System.out.println(title + "/" + author + "/" + (rented?"대여중":"보유중"));
	}

}
