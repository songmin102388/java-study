import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/java";
		String user = "root";
		String pwd = "mysql";
		String sql = "DELETE from ex01 where name = ?"; // 이름기준 삭제
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 이름: ");
		String name = sc.nextLine();
		try {
			// DB 연결
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 값 바인딩
			ps.setString(1, name);
			// 실행 (삭제된 행 수 반환)
			ps.executeUpdate();
			System.out.println("삭제 되었습니다. 히히하");
			ps.close();
			conn.close();
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		

	}

}
