package cote.exam1029;

public class SonDisk implements Usb{
	
	long size;
	long currentSize;
	
	public SonDisk() {
		this(8);
	}
	

	public SonDisk(int giga) {
		size = giga * 1073741824;
		currentSize = 0;
	}
	
	@Override
	public String read() {
		// TODO Auto-generated method stub
		return currentSize + " 사용 ";
	}

	@Override
	public void write(String data) {
		int len = data.length();
		if(size - currentSize >= len)
			currentSize += data.length();
		
	}

}
