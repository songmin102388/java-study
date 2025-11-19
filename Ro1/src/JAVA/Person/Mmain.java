package JAVA.Person;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;

public class Mmain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File dir = new File("c: \\ data");
		File file = new File(dir,"myfriends.dat");
		Vector vc  = new Vector(); // arrayList에 비해 속도는 느리지만 멀티 환경에서는 더 안적이다.
		if (file.exists()) {
			ObjectInputStream ois = new ObjectInputStream(
					new BufferedInputStream(new FileInputStream(file)));
			vc = (Vector<Person>) ois.readObject();
			ois.close();	
		}
		
		while (true) {
			System.out.println("1. 친구 등록  2. 전체보기  3. 친구 삭제  4.친구 수정  5 .종료 =");
			int x = Integer.parseInt(Person.in.readLine());
			if (x==1) {
				Person ps  = new  Person();
				vc.add(ps);
				System.out.println("친구 1명을 등록 하였습니다.");
			} 
			else if (x==2) {
				for(int i = 0;i< vc.size();i++) {
					Person imsi = (Person) vc.get(i);
					imsi.disp();
				}
			} 
			else if (x==5) {
				ObjectOutputStream oos = new ObjectOutputStream(
						new BufferedOutputStream(new FileOutputStream(file)));
				oos.writeObject(vc);
				oos.close();
				System.exit(0);
			} 
			else {
				System.out.println("잘못 입력 !!");
			}
		}
		
	}

}
