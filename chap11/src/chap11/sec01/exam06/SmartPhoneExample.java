package chap11.sec01.exam06;

public class SmartPhoneExample {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);

	}
	
	
	@Override
	public String toString() {
		Object studentId = null;
		Object name = null;
		if (studentId == name) {
			System.out.println("true");
		}
		return null;
	}
}
