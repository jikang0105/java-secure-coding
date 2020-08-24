package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class TestListener
 *
 */
public class TestListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public TestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * web application 종료 직전에 호출되는 메서드
     * web application 종료 전에 실행해야 할 작업을 명시한다(백업..)
     */
    public void contextDestroyed(ServletContextEvent event)  { 
         System.out.println("contextDestroyed 실행!");
         String path = event.getServletContext().getInitParameter("path");
         System.out.println(path + " 파일에 웹어플리케이션 백업 정보 저장");
    }

	/**
     * web application 시작시 ServletContext 생성 직후 호출되는 메서드
     * web application 초기화 관련 작업을 수행할 수 있다.
     */
    public void contextInitialized(ServletContextEvent event)  { 
        System.out.println("contextTnitialized 실행!");
        event.getServletContext().setAttribute("info","비밀의숲");
    }
	
}
