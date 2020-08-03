package step8;

import java.io.IOException;

public class TestImageService {
	public static void main(String[] args) {
		String copyPath="C:\\kosta203\\iotest3\\아이유.jpg";
		String pastePath="C:\\kosta203\\iotest4\\복사본-아이유.jpg";
		ImageService serice = new ImageService();
		try {
			serice.copyAndPasteImage(copyPath, pastePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
