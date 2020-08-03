package step8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 이미지 처리를 위해 byte(8bit) 스트림을 이용한다.
 * 입력스트림 : 노드스트림 - FIleInputStream, 프로세스스트림 - BufferedInputStream
 * 출력스트림 : 노드스트림 - FileOutputStream. 프로세스스트림 - BufferedOutputSrteam
 * @author KOSTA
 *
 */
public class ImageService {
	
	public void copyAndPasteImage (String copyPath, String pastePath) throws IOException {
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(copyPath));
			bos = new BufferedOutputStream(new FileOutputStream(pastePath));
			int data = bis.read();
			while(data != -1) {
				bos.write(data);
				data=bis.read();
			}
		} finally {
			if(bis!=null) {
				bis.close();
			}
			if(bos!=null) {
				bos.close();
			}
				
		}
	}
}
