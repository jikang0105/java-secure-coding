package listener;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import model.MemberVO;

/**
 * Application Lifecycle Listener implementation class ListListener
 *
 */
public class ListListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ListListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent event)  { 
         System.out.println("constextDestroyed 실행!");
         String path = event.getServletContext().getInitParameter("filePath");
                  
         try {
        	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
			oos.writeObject(event.getServletContext().getAttribute("list"));
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.println(path + "에 웹어플리케이션 백업정보저장.");
    }

	
    public void contextInitialized(ServletContextEvent event)  { 
         System.out.println("constextInitialized 실행!");
         String path = event.getServletContext().getInitParameter("filePath");
         File file = new File(path);
         //ArrayList<MemberVO> list;
                  
         if(file.isFile()) {
        	 try {
        		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        		//MemberVO vo = (MemberVO) ois.readObject();
				//list = new ArrayList<MemberVO>();
				//list.add(vo);
				event.getServletContext().setAttribute("list",ois.readObject());
				ois.close();
			} catch (IOException | ClassNotFoundException e) {
				e.printStackTrace();
			}
         } else {
        	 ArrayList<MemberVO> list = new ArrayList<MemberVO>();
        	 event.getServletContext().setAttribute("list",list);
         }
    }
	
}
