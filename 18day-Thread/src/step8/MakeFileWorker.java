package step8;

import java.io.File;
import java.io.IOException;
import java.util.Random;


public class MakeFileWorker implements Runnable {
	
	private int makeCount;
	private int makePeriod;
	
	MakeFileWorker(int makeCount, int makePeriod){
		this.makeCount = makeCount;
		this.makePeriod = makePeriod;
	}
	
	public void run() {
	
			try {
				createDir();
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
			
		
	}
	
	public void createDir() throws IOException {
		
		File dir = new File(CommonInfo.MAKE_PATH);
		if(dir.isDirectory()==false) {
		
			dir.mkdirs();
		}
		for(int i = 0; i < makeCount; i++) {
			File file = new File(CommonInfo.MAKE_PATH+File.separator+createFileName(i));
			file.createNewFile();
			try {
				Thread.sleep(makePeriod);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public String createFileName(int name) {
		Random r = new Random();
		if(r.nextBoolean()) {
			return name + ".mp3";
		} else {
			return name + ".avi";
		}
	}
}
