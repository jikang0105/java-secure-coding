package step2.review;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TestVoidAndReturnUI {
	private JFrame f;
	private JButton btn1, btn2;
	private JPanel panel;
	private JTextField tf;
	public void go() {
		f=new JFrame("웹으로 상상");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		Container contentPane = f.getContentPane();	   	
		
		btn1=new JButton("return값이 있는 메서드");
		btn1.addActionListener(new ButtonHandler());
		btn2=new JButton("void로 명시된 메서드");
		btn2.addActionListener(new ButtonHandler());
		panel=new JPanel();
		panel.add(btn1);  
		panel.add(btn2);

		f.add(panel,BorderLayout.CENTER);
		tf=new JTextField();
		
		contentPane.add(tf, BorderLayout.SOUTH);
		f.pack();
		f.setLocation(500, 200);
		f.setVisible(true);
	}
	class ButtonHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			GoogleService service=new GoogleService();
			tf.setText("");
			if(e.getSource()==btn1) {
				// test1() 리턴값이 있으면 연산결과를 반환받아
				// 내 UI화면에 표현할 수 있다.
				String result=service.test1();
				System.out.println(result);
				tf.setText("결과:"+result);
			}else if(e.getSource()==btn2) {
				// test2()가 void 즉 리턴값이 없으므로 
				// 호출하여 실행시키는 것만 가능!
				//String result=service.test2(); // error 
				service.test2();
			}
		}		
	}	
	public static void main(String[] args) {
		TestVoidAndReturnUI t=new TestVoidAndReturnUI();
		t.go();
	}
}
