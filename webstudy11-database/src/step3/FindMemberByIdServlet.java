package step3;

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
 * Servlet implementation class FindMemberByIdServlet
 */
@WebServlet("/FindMemberByIdServlet")
public class FindMemberByIdServlet extends HttpServlet {
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
		String id = request.getParameter("memberId");
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(dbUrl, userName, userPass);
			System.out.println("db connection");
			String sql = "SELECT name, address FROM web_member WHERE id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setNString(1, id);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				out.println("아이디 : " + id + "<br>");
				out.println("이름 : " + rs.getString(1) + "<br>");
				out.println("주소 : " + rs.getString(2));
			} else {
				out.println(id+"에 대한 회원정보가 없습니다.");
			}
		} catch (Exception e) {
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
