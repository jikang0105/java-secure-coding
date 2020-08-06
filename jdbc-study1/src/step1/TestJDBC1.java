package step1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 *  Oracle DB와 연동하는 자바 어플리케이션 테스트
 *  SELECT구문을 실행해 결과를 조회하여 출력하는 예제
 *  
 *  JDBC 프로그래밍 개발 단계
 *  1. 데이터베이스 연동을 위한 jdbc driver loading
 *  2. Connection
 *  3. SQL 정의 후 PreparedStatement
 *  4. SQL 실행 executeQuery()
 *  5. ResultSet : 		next():boolean , getString() or getInt()
 *  6. close 
 *  
 */
public class TestJDBC1 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			System.out.println("oracle driver loading ok!");
			Connection con = DriverManager.getConnection(dbUrl, "scott", "tiger");
			System.out.println("db connect ok!" + con);
			String sql = "SELECT ID, PASSWORD, NAME, ADDRESS FROM MEMBER";
			PreparedStatement pstmt = con.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) { // 결과행이 있을 때까지 반복
				String id = rs.getNString(1); // 1은 column index -> ID
				String password = rs.getNString(2);
				String name = rs.getNString(3);
				String address = rs.getNString(4);
				System.out.println(id + "\t\t" + password + "\t\t" + name + "\t\t" + address);
				
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
