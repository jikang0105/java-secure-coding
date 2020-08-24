package step2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberVO;


public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	// 멀티스레드에 의해 공유되는 객체이므로 동기화 처리를 해준다.
	//ArrayList<MemberVO> memberList;
	private List<MemberVO> memberList; // 동기화 처리한 리스트로 변경해본다.
     
	public void init() throws ServletException {
        // init()메서드는 단 한번 실행되고 ServletContext 객체를 사용할 수 있다.
		// ServletContext에 list를 생성해 할당한다.
        //memberList = new ArrayList<MemberVO>();
		memberList=Collections.synchronizedList(new ArrayList<MemberVO>());
        getServletContext().setAttribute("memberList", memberList);
        
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8" );
		PrintWriter out = response.getWriter();
		request.setCharacterEncoding("utf-8");
		String nick = request.getParameter("nick");
		String email = request.getParameter("email");
		memberList.add(new MemberVO(nick, email));
		//request.setAttribute("memberList", memberList);
		out.println(nick + "님 목록에 등록되었습니다.");
		out.println("<a href = ListServlet>등록목록보기</a>");
		out.close();
	}
	
	

}
