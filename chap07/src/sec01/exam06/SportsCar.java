package sec01.exam06;

public class SportsCar extends Car{
	//메소드 재정의
	@Override
	public void speedUp() {
		speed += 10;
	}
	
	// final 메소드는 재정의할 수 없음.
	/*
	@Override
	public void stop() {
		System.out.println("스포츠카를 멈춤.");
		speed = 0;
	}
	*/
}
