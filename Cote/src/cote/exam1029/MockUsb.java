package cote.exam1029;

public class MockUsb implements Usb{

	@Override
	public String read() {
		return "OK";
	}

	@Override
	public void write(String data) {		
	}

}
