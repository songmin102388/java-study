package sec06.exam04.package2;

import sec06.exam04.package1.A;

public class C {
	A a1 = new A(true);
	// A a2 = new A(1); // 패키지가 달라서 default 접근제어 생성자 사용 불가능
	// A a3 = new A("문자열"); // private 생성자 사용 불가능
}
