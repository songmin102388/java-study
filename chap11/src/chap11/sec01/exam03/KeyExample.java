package chap11.sec01.exam03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		
		HashMap< Integer, String> map = new HashMap<>();
		map.put(1, "hello");
		map.put(100,  "world");
		
		System.out.println(map.get(100));
		
		//Key 객체를 식별로 사영해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new Key(1)" 로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");
		
		//식별키 "new Key(1)" 로 "홍길동"을 읽어오지 못함.
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}

}
