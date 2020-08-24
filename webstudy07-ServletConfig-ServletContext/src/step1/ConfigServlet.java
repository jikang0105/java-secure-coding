package step1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ServletConfig를 분석하는 예제
 * 
 * @author KOSTA
 *
 */

public class ConfigServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int serviceCount;
	private String savePath;
    public ConfigServlet() {
        super();
        System.out.println(getClass().getName()+" 생성");
    }
    @Override
    	public void init() throws ServletException {
    		System.out.println(getServletConfig());
    		savePath = this.getServletConfig().getInitParameter("savePath");
    		try {
    			File countFile = new File(savePath);
    			if(countFile.isFile()) {
    				BufferedReader br = new BufferedReader(new FileReader(countFile));
    				serviceCount = Integer.parseInt(br.readLine());
    				System.out.println("init() 실행.. 서비스 수, 인스턴스 변수에 할당 " + serviceCount);
    				br.close();
    			}else {
    				System.out.println("init() 실행");
    			}
				
			} catch ( NumberFormatException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
    	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf8");
		PrintWriter out = response.getWriter();
		out.println("서비스 count : ");
		out.println(++serviceCount);		
		out.close();
	}
	public void destroy() {
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(savePath));
			pw.println(serviceCount);
			System.out.println("destroy() 실행" + serviceCount + " 서비스 수 파일에 저장");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
