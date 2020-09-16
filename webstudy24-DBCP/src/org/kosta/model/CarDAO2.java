package org.kosta.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

/*
 * DBCP를 이용해 커넥션을 빌려오고 반납받는다.
 * 
 * DAO : Data Access Object
 * DAO에 Singleton Design Pattern을 적용한다
 * : 시스템 상에서 단 한번 객체 생성하고 여러곳에서 공유해서 사용하도록 한다.
 */
public class CarDAO2 {
		
	private static CarDAO2 instance = new CarDAO2();
	private DataSource dataSource;
	private CarDAO2() {
		this.dataSource=DataSourceManager.getInstance().getDataSource();
	}
	
	// public static 메서드로 외부에 공유한다
	public static CarDAO2 getInstance(){
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
			con.close(); // 커넥션을 dbcp에 반납한다(소멸시키는 것이 아니다)
		}
	}
	public CarDTO findCarByNo(String no) throws SQLException {
		CarDTO cdto = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// dbcp로 부터 커넥션을 빌려온다(생성하는 것이 아니다)
			con = dataSource.getConnection();
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
	public ArrayList<CarDTO> getAllCarList() throws SQLException{
		ArrayList<CarDTO> list = new ArrayList<CarDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = dataSource.getConnection();
			String sql = "SELECT car_No, model FROM mvc_car ORDER BY car_no DESC";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new CarDTO(rs.getString(1), rs.getString(2)));
			}
		} finally {
			CloseAll(rs, pstmt, con);
		}
		return list;
	}
}
