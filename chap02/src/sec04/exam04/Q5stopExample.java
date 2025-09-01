package sec04.exam04;

public class Q5stopExample {
	public static void main(String[] args) throws Exception{
		int keyCode;
		
		while(true) {
			keyCode =System.in.read();
			System.out.println("keyCode: " + keyCode);
			if(keyCode == 113) {
				break;       //keyCode가 113일 경우(소문자 q)while을 중지
			}
		}
		System.out.println("????");
	}
}
