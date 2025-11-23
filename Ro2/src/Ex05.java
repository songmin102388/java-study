import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/java";
		String user = "root";
		String pwd = "mysql";
		String sql = "UPDATE ex01 SET age = ? where name = ?"; // 이름기준 삭제
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수정 이름: ");
		String name = sc.nextLine();
		System.out.println("새 나이: ");
		int newAge = sc.nextInt();
		
		try {
			// DB 연결
			Connection conn = DriverManager.getConnection(url, user, pwd);
			PreparedStatement ps = conn.prepareStatement(sql);
			
			// 값 설정
			ps.setInt(1, newAge);
			ps.setString(2, name);
			
			//실행
			int result = ps.executeUpdate();
			if(result > 0) {
				System.out.println(result + "개의 데이터가 수정되었습니다.");
			} else { 
				System.out.println("해당 이름의 데이터가 없습니다.");
			}
			
			// 자원 해제
			ps.close();
			conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		sc.close();

	}

}
