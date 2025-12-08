package chap11.sec01.exam14;

public class StringEqualsExample {

	public static void main(String[] args) {
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참초");
		} else  {
			System.out.println("다 String 객체를 참초");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
			
		} else {
			System.out.println("다른 문자열을 가");
		}
	}

}
