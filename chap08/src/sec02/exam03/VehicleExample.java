package sec02.exam03;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); (x) // Vehicle 타입에는 checkFare 함수가 없음
		
		Bus bus = (Bus) vehicle; //강제 타입 변환
		
		bus.run();
		bus.checkFare(); // Bus 타입에는 checkFare 함수가 있
		}

	}


