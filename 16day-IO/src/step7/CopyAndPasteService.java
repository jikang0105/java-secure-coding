package step7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class CopyAndPasteService {
	public ArrayList<String> copy(String copyPath) throws IOException {
		BufferedReader br = null;
		try {
			ArrayList<String> list = new ArrayList<String>();
			br = new BufferedReader(new FileReader(copyPath));
	//		FileReader fr = new FileReader(copyPath);
	//		BufferedReader br = new BufferedReader(fr);
			
			while(br.ready()) {
				list.add(br.readLine());
			}
			return list;
		} finally {
			if(br!=null) {
			br.close();
			}
		}
	}
	
	public void paste(ArrayList<String> list, String pastePath) throws IOException {
		PrintWriter pw = null;
		try {
			new File(pastePath).getParentFile().mkdirs();
	//		File file = new File(pastePath);
	//		File dir = file.getParentFile();
	//		dir.mkdir();
			pw = new PrintWriter(new FileWriter(pastePath));
			
			for(int i = 0; i < list.size(); i++) {
				pw.println(list.get(i));
			}
		} finally {
			if(pw!=null) {
				pw.close();
			}
		}
	}
	
	public void execute(String copyPath, String pastePath) throws IOException {
		ArrayList<String> list = copy(copyPath);
		paste(list, pastePath);
		
	}
}
