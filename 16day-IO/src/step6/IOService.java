package step6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class IOService {
	public void saveFile(String path, ArrayList<String> list) throws IOException {
		File file = new File(path);
		// 상위 디렉토리를 반환받아 생성
		File dir = file.getParentFile();
		dir.mkdirs();
		PrintWriter pw = new PrintWriter(new FileWriter(path));
		for(int i = 0; i< list.size(); i++) {
		pw.println(list.get(i));
		}
		pw.close();
	}

	public ArrayList<String> readFile(String path) throws IOException {
		ArrayList<String> list = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new FileReader(path));
		while(br.ready()) {
			list.add(br.readLine());
		}
		br.close();
		return list;
	}
}
