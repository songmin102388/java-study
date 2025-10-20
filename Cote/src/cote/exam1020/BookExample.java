package cote.exam1020;

public class BookExample {

	public static void main(String[] args) {
		Book[] books = new Book[3];
		books[0] = new Book("Java","김자바","123-456-789",400000);
		books[1] = new Book("Java Script","김자스크립트","123-456-789",200000);
		books[2] = new Book("Python","엄마손파이","444-523-518",30000);
		
		
		// 인덱스만 출
		for(int i =0;i<books.length;i++) {
			System.out.println(books[i].getTitle());
		}
		
		
		
		//  또는  책제목만 출력만 함 인덱스 x
		for(Book book :books) {
			System.out.println(book.getTitle());
		}
	}

}
