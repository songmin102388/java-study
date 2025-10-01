package sec01.exam07.pack2;

import sec01.exam07.pack1.A;

public class D extends A{
	//다른 패키지지만 A클래스를 상속받아 protected 요소에 접근할 수 있음.
	public D() {
		super();
		this.field = "value";
		this.method();
	}
}
