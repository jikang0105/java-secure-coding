package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kosta.model.BoardDAO;
import org.kosta.model.MemberVO;
import org.kosta.model.PostVO;

public class WritePostController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session=request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null||
				request.getMethod().equals("POST")==false){
			return "redirect:index.jsp";
		}
		String title = request.getParameter("title");
		String content = request.getParameter("content");
				
		PostVO pvo=new PostVO();
		pvo.setTitle(title);
		pvo.setContent(content);
		pvo.setMemberVO((MemberVO)session.getAttribute("mvo"));		
		BoardDAO.getInstance().posting(pvo);		
		String path="redirect:front?command=PostDetailNoHits&no="+pvo.getNo();
		return path;
	}

}
