package step8;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * �̹��� ó���� ���� byte(8bit) ��Ʈ���� �̿��Ѵ�.
 * �Է½�Ʈ�� : ��彺Ʈ�� - FIleInputStream, ���μ�����Ʈ�� - BufferedInputStream
 * ��½�Ʈ�� : ��彺Ʈ�� - FileOutputStream. ���μ�����Ʈ�� - BufferedOutputSrteam
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
