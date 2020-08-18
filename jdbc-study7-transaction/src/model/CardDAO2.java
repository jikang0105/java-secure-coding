package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.DbInfo;

/**
 * CardDAO1������ ī�尡 ��ϵǰ�, ����Ʈ ��Ͻ� ������ �߻��ϴ���
 * ī��� ���� DB�� ������ ��ϵǴ� ���� ������ �߻��ߴ�.
 * Ʈ����� ó���� ���� �ϳ��� �۾�����(ī�� ��Ͽ� ����Ʈ ���)�� ��� ��������
 * �� ����Ǿ��� ���� ���� �����ͺ��̽��� ��ϵǵ��� ó���� �غ���.
 * ���� �߻��ÿ��� ��� �۾��� ��ҵǵ��� ó���Ѵ�.
 * @author KOSTA
 *
 */
public class CardDAO2 {
	//������
	public CardDAO2() throws ClassNotFoundException{
		Class.forName(DbInfo.DRIVER_NAME);
		
	} // ������
	// closeAll
	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if (pstmt != null)
			pstmt.close();
		if (con != null)
			con.close();
	} // closeAll
	public void registerCardAndPoint(String id, String name, String pointType, int point) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			String insertCardSql = "INSERT INTO CARD(id, name) VALUES(?, ?)";
			String insertPointSql = "66INSERT INTO POINT(id, point_type, point) VALUES(?, ?, ?)";
			con = DriverManager.getConnection(DbInfo.URL, DbInfo.USER, DbInfo.PASS);
			// Ʈ����� ó���� ���� ����Ŀ�� ��带 �����Ѵ�.
			con.setAutoCommit(false);
			
			pstmt=con.prepareStatement(insertCardSql);
			pstmt.setString(1, id);
			pstmt.setString(2, name);
			int result = pstmt.executeUpdate();
			System.out.println("card insert success " + result);
			pstmt.close();
			pstmt = con.prepareStatement(insertPointSql);
			pstmt.setString(1, id);
			pstmt.setNString(2, pointType);
			pstmt.setInt(3,  point);
			int result2 = pstmt.executeUpdate();
			System.out.println("point insert success " + result2);
			// ī�� �߱� �۾��� ��� ���������� ����Ǿ��� �� ���� �����ͺ��̽��� ������ ��Ͻ�Ų��.
			con.commit();
			System.out.println("ī�� �߱��� ��� �۾��� ���������� ����Ǿ� Ŀ���Ͽ����ϴ�.");
		} catch(Exception e) {
			con.rollback();
			System.out.println("ī�� �߱� �۾��� ������ �߻��Ͽ� �۾��� ����ϰ� �ѹ��Ͽ����ϴ�.");
			// ����� �ڵ�(client code) ���� ���� ��Ȳ�� �˸��� ���� �ٽ� ���ܸ� �߻�����
			// ȣ���� ������ �����ϱ� ���� �Ʒ� �ڵ带 �ۼ��Ѵ�.
			throw e;
		} finally {
			closeAll(pstmt, con);
		}
		
	}

	
}
