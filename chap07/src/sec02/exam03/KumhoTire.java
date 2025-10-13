package sec02.exam03;

public class KumhoTire extends Tire{
	//생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	//매소드
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation<maxRotation) {
			System.out.println(location + "KumhoTire 수: " + (maxRotation-accumulatedRotation) + "");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}
