package cote.exam1126;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student("1111", "홍길동", "h@mail.com");
		Student s2 = new Student("1111", "홍길동", "kdhong@mail.com");

		System.out.println(s1 ==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s2);
		
		

	}

}
