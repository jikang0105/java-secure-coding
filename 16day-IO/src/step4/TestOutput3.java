package step4;

import java.io.File;
import java.io.IOException;

public class TestOutput3 {
	public static void main(String[] args) {
		MenuService service = new MenuService();
		String path = "C:" + File.separator + "kosta203" + File.separator + "iotest2" + File.separator + "order.txt";
		try {
			service.order(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
