package test.xml;

import java.io.FileWriter;
import java.io.IOException;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

/*
 * 	XML ( Extensible Markup Language )
 * : 특수한 목적의 언어를 생성하고 로딩하여 사용하고자 할 때 쓰는
 * 마크업 언어이다. 주로 용도는 설정정보와 데이터 전송용도가 있다.
 * Ajax 통신에서는 데이터 전송용으로 XML을 이용한다.
 * 
 * 아래 예제는 jdom라이브러리를 이용해 xml 파일을 생성하는 예제이다.
 */
public class TestCreateXML {
	public static void main(String[] args) {
		//xml을 생성한다
		Document myDocument = new Document();
		Element root = new Element("car");
		myDocument.setRootElement(root);
		root.addContent(new Element("model").addContent("SM6"));
		root.addContent(new Element("price").addContent("4000"));
		// xml파일로 출력한다.
		XMLOutputter xmlOut = new XMLOutputter();
		try {
			FileWriter fw = new FileWriter("C:\\kosta203\\test.xml");
			xmlOut.output(myDocument,  fw);
			System.out.println("xml 생성");
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
