package step4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FindMemberListByAddress
 */
@WebServlet("/FindMemberListByAddress")
public class FindMemberListByAddress extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private String dbUrl;
	private String userName;
	private String userPass;
	
    public void init() {
    	this.dbUrl = getServletContext().getInitParameter("dbUrl");
    	this.userName = getServletContext().getInitParameter("userName");
    	this.userPass = getServletContext().getInitParameter("userPass");
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body bgcolor=yellow>");
		//client로부터 전달되는 address를 반환받는다
		String address = request.getParameter("address");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		out.println(address + "에 사는 회원명단.<br><br>");
		try {
			con = DriverManager.getConnection(dbUrl, userName, userPass);
			System.out.println("db connection");
			String sql = "SELECT name, id FROM web_member WHERE address = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, address);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				out.println("이름 : " + rs.getString(1) );
				out.println("아이디 : " + rs.getString(2) + "<br>");
			} 
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
			if(rs != null) {
				rs.close();
			}
			if(pstmt != null) {
				pstmt.close();
			}
			if(con != null) {
					con.close();
			}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		out.println("</body></html>");
	}

}
