package step3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;


public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //ArrayList<MemberVO> memberList;  
	List<MemberVO> memberList;
    public void init() {
    	//memberList = (ArrayList<MemberVO>) getServletContext().getAttribute("memberList");
    	memberList = (List<MemberVO>) getServletContext().getAttribute("memberList");
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		//ArrayList<MemberVO> memberList = (ArrayList<MemberVO>) request.getAttribute("memberList");
		for(int i = 0; i < memberList.size(); i++) {
			out.println(i + 1 + ". " + memberList.get(i).getNick() + memberList.get(i).getEmail() + "<br>");
		}
		out.println("<hr>");
		out.println("<a href = index.html>home으로</a>");
		out.close();
	}

}
