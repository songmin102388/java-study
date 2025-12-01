package chap11.sec01.exam10;

public class ClassExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("images/001.jpg").getPath();
		String photo2Path = clazz.getResource("003.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);

	}

}
