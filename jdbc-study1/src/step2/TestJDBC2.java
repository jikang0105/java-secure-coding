package step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 *  SELECT ��ȸ�� ������ WHERE �� �̿��� ��ȸ�غ���
 */
public class TestJDBC2 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			System.out.println("oracle driver loading ok!");
			Connection con = DriverManager.getConnection(dbUrl, "scott", "tiger");
			// sql�� ����
			String address = "������";
			String sql = "SELECT ID, NAME FROM MEMBER WHERE ADDRESS = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, address); // 1�� ù��° ����ǥ�� �ǹ��Ѵ�, '?' �� ���������� �Ҵ��Ѵ�.
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getNString("ID") + "\t\t" + rs.getNString("NAME"));
			}
			rs.close();
			pstmt.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
