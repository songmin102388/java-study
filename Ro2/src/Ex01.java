import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Ex01 {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/java"; // DB 이름
		String user = "root";    // 사용자
		String password = "mysql";  // 비밀번호
		String sql = "insert into ex01 values(?,?)";
		
		try (Connection conn = DriverManager.getConnection(url,user, password)){
			PreparedStatement pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, "이송민");
			pstmt.setInt(2, 17);
			pstmt.executeUpdate();
			System.out.println("추가 되었습니다.");
		}
		catch(SQLException e) {
			System.out.println("오류 : " + e);
		}
	}

}
// 이 코드는 안보고도 코딩할줄 알아야하는 기본임 제발 외우자 ㅂㅅ새끼
