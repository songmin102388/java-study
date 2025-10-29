package cote.exam1029;

public class PC {
	Usb port1;
	Usb port2;
	
	public void test() {
		if(port1 != null) 
			System.out.println(port1.read());
		if(port2 != null) 
			System.out.println(port2.read());
		
	}
		
}
