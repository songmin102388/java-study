package sec03.exam02;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메소드. 자식 클래스들이 필수적으로 override 해야 하는 메소드.
	public abstract void sound();
}
