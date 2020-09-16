package org.kosta.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * DAO : Data Access Object
 * DAO에 Singleton Design Pattern을 적용한다
 * : 시스템 상에서 단 한번 객체 생성하고 여러곳에서 공유해서 사용하도록 한다.
 */
public class CarDAO {
	private String driver="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user="scott";
	private String pass="tiger";
	// 클래스 로딩시에 딱 한번만 객체를 생성해서 method area(or class area)의 static 변수 영역에
	// dao의 주소값을 저장한다.
	private static CarDAO instance = new CarDAO();
	// 생성자에 private을 병시하여 외부에서 생성하지 못하게 막는다.
	private CarDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	// public static 메서드로 외부에 공유한다
	public static CarDAO getInstance(){
		return instance;
	}
	public void CloseAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs!=null) {
			rs.close();
		}
		if(pstmt!=null) {
			pstmt.close();
		}
		if(con!=null) {
			con.close();
		}
	}
	public CarDTO findCarByNo(String no) throws SQLException {
		CarDTO cdto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, user, pass);
			String sql = "SELECT model, price FROM mvc_car WHERE car_no = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, no);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				cdto = new CarDTO(no, rs.getString(1), rs.getInt(2));
			}
		} finally {
			CloseAll(rs, pstmt, con);
		}
		return cdto;
	}
}
