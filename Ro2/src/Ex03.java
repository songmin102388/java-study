import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex03 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/java";
		String user = "root";
		String pwd = "mysql";
		String sql = "select * from ex01";
		
		try {
			Connection conn=DriverManager.getConnection(url, user, pwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				String name = rs.getString(1);
				int age = rs.getInt(2);
				System.out.println("이름: " +name + ", 나이:" + age);
			}
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
