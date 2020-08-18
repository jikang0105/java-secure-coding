package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

import common.DbInfo;

public class EmployeeDAO {

	public EmployeeDAO() throws ClassNotFoundException {
		Class.forName(DbInfo.DRIVER_NAME);
		
	}
	public ArrayList<EmployeeVO> getEmpByLowSal(String job) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
		try {
			con = DriverManager.getConnection(DbInfo.URL, DbInfo.USER, DbInfo.PASS);
			String sql = "SELECT empno, name, job, salary FROM employee WHERE salary = (SELECT MIN(salary) FROM employee WHERE job = ?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, job);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(new EmployeeVO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	
	private void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs != null)
			rs.close();
		if(pstmt != null)
			pstmt.close();
		if(con != null)
			con.close();		
	}
	public ArrayList<HashMap<String, Object>> getJobGroupInfoGroupByJob() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		try {
			con = DriverManager.getConnection(DbInfo.URL, DbInfo.USER, DbInfo.PASS);
			String sql = "SELECT job, MAX(salary) AS highsal FROM employee GROUP BY job ORDER BY highsal DESC";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//list.add((LinkedHashMap<String, Object>) new LinkedHashMap<String, Object>().put(rs.getString(1), rs.getObject(2)));
				HashMap<String, Object> map = new HashMap<String, Object>();
				map.put("job", rs.getString(1));
				map.put("highsal", rs.getInt(2));
				list.add(map);
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
		
	}
	public ArrayList<String> getJobKind() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<String> list = new ArrayList<String>();
		try {
			con = DriverManager.getConnection(DbInfo.URL, DbInfo.USER, DbInfo.PASS);
			String sql = "SELECT DISTINCT(job) FROM employee";
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				list.add(rs.getString(1));
			}
		} finally {
			closeAll(rs, pstmt, con);
		}
		return list;
	}
	

}
