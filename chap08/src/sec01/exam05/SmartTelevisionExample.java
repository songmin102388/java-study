package sec01.exam05;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		// SmartTelevision 객체는 두 인터페이스를 구현했으므로
		// RemoteControl 타입이라 할 수도 있고
		// Searchable 타입이라 할 수도 있다.
		RemoteControl rc = tv;
		rc.turnOn();
		Searchable searchable = tv;
		searchable.search("interface");
	}

}
