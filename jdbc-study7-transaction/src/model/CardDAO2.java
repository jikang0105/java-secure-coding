package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import common.DbInfo;

/**
 * CardDAO1에서는 카드가 등록되고, 포인트 등록시 에러가 발생하더라도
 * 카드는 실제 DB에 정보가 등록되는 논리상 문제가 발생했다.
 * 트랜잭션 처리를 통해 하나의 작업단위(카드 등록와 포인트 등록)가 모두 문제없이
 * 잘 수행되었을 때만 실제 데이터베이스에 등록되도록 처리를 해본다.
 * 문제 발생시에는 모든 작업이 취소되도록 처리한다.
 * @author KOSTA
 *
 */
public class CardDAO2 {
	//생성자
	public CardDAO2() throws ClassNotFoundException{
		Class.forName(DbInfo.DRIVER_NAME);
		
	} // 생성자
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
			// 트랜잭션 처리를 위해 오토커밋 모드를 해제한다.
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
			// 카드 발급 작업이 모두 정상적으로 수행되었을 때 실제 데이터베이스에 정보를 등록시킨다.
			con.commit();
			System.out.println("카드 발급의 모든 작업이 정상적으로 수행되어 커밋하였습니다.");
		} catch(Exception e) {
			con.rollback();
			System.out.println("카드 발급 작업시 문제가 발생하여 작업을 취소하고 롤백하였습니다.");
			// 사용자 코드(client code) 측에 예외 상황을 알리기 위해 다시 예외를 발생시켜
			// 호출한 곳으로 전달하기 위해 아래 코드를 작성한다.
			throw e;
		} finally {
			closeAll(pstmt, con);
		}
		
	}

	
}
