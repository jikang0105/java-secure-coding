package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;

/**
 * Servlet implementation class EnterServlet
 */
public class EnterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private ArrayList<MemberVO> list;
	
	@SuppressWarnings("unchecked")
	public void init() {
		// ListListener의 contectTnitialized()에서 할당한 list를 반환받는다.
		list = (ArrayList<MemberVO>) getServletContext().getAttribute("list");
	}
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		list.add(new MemberVO(name, address));
		out.println(address + "에 사는 " + name + "님 입장을 환영합니다.");
		out.println("<a href = ListServlet>입장회원 명단 보기</a>");
		
		
	}

}
