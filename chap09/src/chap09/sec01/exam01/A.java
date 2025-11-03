package chap09.sec01.exam01;

public class A {
	A() {System.out.println("A 객체사 생성");}
	
	public class B { 
		B() {System.out.println("B 객체가 생성");}
		int field1;
		void method1() { }
	}
	
	static class C {
		C() { System.out.println("B 객체가 생성");}
		int field1;
		static int field2;
		void method1() { }
		static void method2() { } 
	}
	
	void method() {
		class D {
			D() { System.out.println("B 객체가 생성");}
			int field1;
			void method1() { }
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}
