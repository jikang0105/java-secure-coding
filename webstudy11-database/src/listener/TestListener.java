package listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class TestListener
 *
 */
@WebListener
public class TestListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public TestListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         System.out.println("contextDestroyed");
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     * 웹어플리케이션 시작시 한번 실행된다.
     * db driver loading은 시스템에서 한번만 실행하면 되므로 contextInitialized에서 하는것이 적합하다.
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
    	String dbDriver = arg0.getServletContext().getInitParameter("dbDriver");
    	try {
			Class.forName(dbDriver);
			System.out.println("contextInitialized db driver loading");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
    }
	
}
