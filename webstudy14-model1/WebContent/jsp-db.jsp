<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%-- 아래 코드 방식은 권장하지 않는다. --%>
 <%
	String driver = "oracle.jdbc.OracleDriver";
	Class.forName(driver);
	String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	Connection con = DriverManager.getConnection(url, "scott", "tiger");
	String sql = "SELECT COUNT(*) FROM web_member";
	PreparedStatement pstmt = con.prepareStatement(sql);
	ResultSet rs = pstmt.executeQuery();
	int count = 0;
	if(rs.next()){
		count = rs.getInt(1);
}
rs.close();
pstmt.close();
con.close();

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
총 회원수 <%= count %>명
</body>
</html>