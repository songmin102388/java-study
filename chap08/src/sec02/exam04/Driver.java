package sec02.exam04;

public class Driver {
	// 파라미터인 Vehicle은 Bus 객체일 수도 있고 Taxi 객체일 수도 있음.
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			//checkFare 함수는 Bus 타입에만 있음.
			bus.checkFare();
		}
		vehicle.run();
	}
}
