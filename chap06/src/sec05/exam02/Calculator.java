package sec05.exam02;

public class Calculator {
	//객체마다 다른 값을 가질 필요가 없는 필드
	static double pi = 3.14159;
	
	// 인스턴스 정보가 필요 없는 메소드
	static int plus(int x, int y) {
		return x + y;
	}
	
	static int minus(int x, int y) {
		return x - y;
	}

}
