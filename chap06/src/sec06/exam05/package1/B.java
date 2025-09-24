package sec06.exam05.package1;

public class B {
	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1; // default 필드 사용 가능
		//a.field3 = 1; // private 필드 사용할 수 없음.
		
		a.method1();
		a.method2(); // default 메소드 사용 가능
		//a.method3(); //private 메소드 사용 불가능
	}
}
