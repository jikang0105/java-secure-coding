package step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 	INSERT SQL을 이용해 MEMBER TABLE 회원정보를 저장한다.
 */
public class TestJDBC3 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// 1. DB연동을 위한 Driver loading
		try {
			Class.forName(driver);
		 // 2. Connnection
			Connection con = DriverManager.getConnection(dbUrl, "scott", "tiger");
			System.out.println(con);
		 // 3. SQL 정의, PreparedStatement 이용해 SQL 실행
			String sql = "INSERT INTO MEMBER(id, password, name, address) VALUES(?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, "ajax"); // id '?' 에 할당 ' 1 '은 첫번째 물음표를 의미
			pstmt.setNString(2, "1111");
			pstmt.setNString(3, "손흥민");
			pstmt.setNString(4, "토트넘");
		// 4. executeUpdate() : int -> 영향을 준 row수
			// insert, delete, update 시에는 executeUpdate()를 사용하고
			// select 시에는 결과를 반환받기 위해 executeQuery()를 이용해 ResultSet을 반환받는다.
			int result = pstmt.executeUpdate();
			System.out.println("insert ok row : " + result);
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
