import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		String url ="jdbc:mysql://localhost:3306/java";
		String user = "root";
		String password = "mysql";
		String sql = "insert into ex01 values(?,?)";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.executeUpdate();
			conn.close();
			System.out.println("데이터가 추가되었습니다.");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
//이 코드는 안보고도 코딩할줄 알아야하는 기본임 제발 외우자 ㅂㅅ새끼
