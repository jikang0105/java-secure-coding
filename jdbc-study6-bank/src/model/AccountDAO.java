package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import exception.AccountException;
import exception.BlanceException;
import exception.PasswordException;

public class AccountDAO {
	private String driver = "oracle.jdbc.OracleDriver";
	private String dbUrl = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	private String user = "scott";
	private String pass = "tiger";
	
	public AccountDAO() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void AccountInsert(String userName, String userPass, int blance) throws SQLException, BlanceException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO account(accountnum, username, userpass, blance) ");
			sql.append("VALUES(accountnum_seq.nextval, ?, ?, ?)");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setNString(1, userName);
			pstmt.setString(2, userPass);
			pstmt.setInt(3, blance);
			if(blance < 1000) {
				throw new BlanceException("계좌개설시 1000원 이상의 금액이 입금되어야합니다.");
			}
			pstmt.executeUpdate();
		} finally {
			closeAll(pstmt, con);
		}
	}
	
	public boolean AccountCheck(int accountNum) throws SQLException, AccountException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		boolean flag = false;
		try {
			con = DriverManager.getConnection(dbUrl, user, pass);
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT COUNT(*) FROM account WHERE accountnum =? ");
			pstmt = con.prepareStatement(sql.toString()); 
			pstmt.setInt(1, accountNum);
			rs = pstmt.executeQuery();
			rs.next();
			flag = (rs.getInt(1) == 0) ? false : true;
		} finally {
			closeAll(rs, pstmt, con);
		}
		if(flag == false) {
			throw new AccountException("계좌번호가 존재하지 않습니다.");
		} else {
			return flag;
		}
	}
	
	public AccountVO BlanceCheck(int accountNum, String userPass) throws SQLException, AccountException, PasswordException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			AccountCheck(accountNum);
			con = DriverManager.getConnection(dbUrl, user, pass);
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT accountnum, username, userpass, blance FROM account ");
			sql.append("WHERE accountnum = ? AND userpass = ?");
			pstmt = con.prepareStatement(sql.toString()); 
			pstmt.setInt(1, accountNum);
			pstmt.setString(2, userPass);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				AccountVO vo = new AccountVO(rs.getInt(1), rs.getString(2), rs.getNString(3), rs.getInt(4));
				return vo;
			} else {
				throw new PasswordException("비밀번호가 일치하지 않습니다.");
			}
			
		} finally {
			closeAll(rs, pstmt, con);
		}
	}
	
	public AccountVO Minus(int accountNum, String userPass, int blance) throws SQLException, AccountException, PasswordException, BlanceException {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			AccountCheck(accountNum);
			con = DriverManager.getConnection(dbUrl, user, pass);
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE account SET blance = blance - ? ");
			sql.append("WHERE accountnum = ? AND userpass = ?");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, blance);
			AccountVO vo = BlanceCheck(accountNum, userPass);
			if(vo.getBalance() < blance) {
				throw new BlanceException("잔액이 모자릅니다.");
			}
			pstmt.setInt(2, accountNum);
			pstmt.setString(3, userPass);
			pstmt.executeUpdate();
			vo = BlanceCheck(accountNum, userPass);
			return vo;
		} finally {
			closeAll(pstmt, con);
		}
	}
	
	public AccountVO Plus(int accountNum, String userPass, int blance) throws SQLException, AccountException, PasswordException, BlanceException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			AccountCheck(accountNum);
			con = DriverManager.getConnection(dbUrl, user, pass);
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE account SET blance = blance + ? ");
			sql.append("WHERE accountnum = ? AND userpass = ?");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, blance);
			if(blance <= 0) {
				throw new BlanceException("정확한 금액을 입력해주세요.");
			}
			pstmt.setInt(2, accountNum);
			pstmt.setString(3, userPass);
			pstmt.executeUpdate();
			AccountVO vo = BlanceCheck(accountNum, userPass);
			return vo;
		} finally {
			closeAll(pstmt, con);
		}
	}
	
	public void Plus(int accountNum, int blance) throws SQLException, AccountException, PasswordException {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			AccountCheck(accountNum);
			con = DriverManager.getConnection(dbUrl, user, pass);
			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE account SET blance = blance + ? ");
			sql.append("WHERE accountnum = ?");
			pstmt = con.prepareStatement(sql.toString());
			pstmt.setInt(1, blance);
			pstmt.setInt(2, accountNum);
			pstmt.executeUpdate();
			
		} finally {
			closeAll(pstmt, con);
		}
	}
	
	public void closeAll(PreparedStatement pstmt, Connection con) throws SQLException {
		if(pstmt != null) {
			pstmt.close();
		}
		if(con != null) {
			con.close();
		}
	}
	
	public void closeAll(ResultSet rs, PreparedStatement pstmt, Connection con) throws SQLException {
		if(rs != null) {
			rs.close();
		}
		this.closeAll(pstmt, con);
	}
	
	
}
