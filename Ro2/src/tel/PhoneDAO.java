package tel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PhoneDAO {
	private final String url = "jdbc:mysql://localhost:3306/java";
	private final String user = "root";
	private final String pw = "mysql";

	public PhoneDAO() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 실패!");
		}
	}

	public void insert(String name, String phone) {
		String sql = "insert into ex02 values(?,?)";
		try (Connection conn = DriverManager.getConnection(url, user, pw);
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, name);
			ps.setString(2, phone);
			ps.executeUpdate();
			System.out.println("등록 완료!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void selectAll() {
		String sql = "select * from ex02";
		try (Connection conn = DriverManager.getConnection(url, user, pw);
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			System.out.println("[전화번호 목록]");
			while (rs.next()) {
				System.out.println(rs.getString("name") + " : " + rs.getString("phone"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(String name) {
		String sql = "delete from ex02 where name = ?";
		try (Connection conn = DriverManager.getConnection(url, user, pw);
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, name);
			int result = ps.executeUpdate();
			if (result > 0)
				System.out.println("삭제 완료!!!!!!!!!!!");
			else
				System.out.println("해당 이름이 없습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void update(String name, String phone) {
		String sql = "update ex02 set phone = ? where name = ?";
		try (Connection conn = DriverManager.getConnection(url, user, pw);
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, phone);
			ps.setString(2, name);
			int result = ps.executeUpdate();
			if (result > 0)
				System.out.println("수정 완료!");

			else
				System.out.println("해당 이름이 없습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
