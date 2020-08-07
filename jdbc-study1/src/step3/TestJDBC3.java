package step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
 * 	INSERT SQL�� �̿��� MEMBER TABLE ȸ�������� �����Ѵ�.
 */
public class TestJDBC3 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		// 1. DB������ ���� Driver loading
		try {
			Class.forName(driver);
		 // 2. Connnection
			Connection con = DriverManager.getConnection(dbUrl, "scott", "tiger");
			System.out.println(con);
		 // 3. SQL ����, PreparedStatement �̿��� SQL ����
			String sql = "INSERT INTO MEMBER(id, password, name, address) VALUES(?, ?, ?, ?)";
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, "ajax"); // id '?' �� �Ҵ� ' 1 '�� ù��° ����ǥ�� �ǹ�
			pstmt.setNString(2, "1111");
			pstmt.setNString(3, "�����");
			pstmt.setNString(4, "��Ʈ��");
		// 4. executeUpdate() : int -> ������ �� row��
			// insert, delete, update �ÿ��� executeUpdate()�� ����ϰ�
			// select �ÿ��� ����� ��ȯ�ޱ� ���� executeQuery()�� �̿��� ResultSet�� ��ȯ�޴´�.
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
