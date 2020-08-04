package step8;

import java.io.File;
import java.io.IOException;
import java.util.Random;

/*
 *  스레드 프로그램 구현에 앞서 File API를 테스트 하는 예제
 */

class FileService{
	// 지정한 경로에 디렉토리 및 파일 생성
	public void testCreateFile() throws IOException {
		File dir = new File(CommonInfo.MAKE_PATH);
		if(dir.isDirectory()==false) {
			dir.mkdirs(); // 디렉토리 생성
		}
		// 아래 파일 생성 부분에 createFileName메서드를 사용해서
		// 0~9번까지 랜덤한 확장자를 가진 파일을 생성해본다.
		for(int i = 0; i < 10; i++) {
			File file = new File(CommonInfo.MAKE_PATH+File.separator+createFileName(i));
			file.createNewFile();
		}
	}
	// 파일명을 만들어주는 메서드
	public String createFileName(int name) {
		Random r = new Random();
		if(r.nextBoolean()) {
			return name + ".mp3";
		} else {
			return name + ".avi";
		}
	}
	
	public void moveFile() {
		// renameTo(dest) : boolean -> File class의 method로 파일을 이동시켜본다.
		String makeTestPath = CommonInfo.MAKE_PATH+File.separator+"movetest";
		// 원본파일
		File orgFile = new File(CommonInfo.MAKE_PATH+File.separator+"0.mp3");
		// 목적지파일
		File destFile = new File(makeTestPath+File.separator+orgFile.getName());
		System.out.println("원본파일경로 : " + orgFile.getPath());
		System.out.println("이동시킬 파일경로 : " + destFile.getPath());
		destFile.getParentFile().mkdirs();
		// 파일을 이동시킨다
		boolean result = orgFile.renameTo(destFile);
		System.out.println("이동" + result);
	}
	// 디렉토리내에 있는 파일을 모두 지정한 디렉토리로 이동시키는 메서드
	public void moveFiles() {
		// 이동시킬 경로
		String makeTestPath = CommonInfo.MAKE_PATH+File.separator+"movetest";
		// 저장된 원본파일이 있는 경로
		String orgDir = CommonInfo.MAKE_PATH;
		File orgDirectory = new File(orgDir);
		File[] list = orgDirectory.listFiles();
		for(int i = 0; i <list.length; i++) {
			if(list[i].isFile()) {
				//System.out.println(list[i].getName());
				//renameTo를 이용해 파일들을 이동시켜본다.
				if(list[i].getName().endsWith(".mp3")) {
					System.out.println("mp3이동");
				} else {
					System.out.println("avi이동");
				}
				File destFile = new File(makeTestPath+File.separator+list[i].getName());
				list[i].renameTo(destFile);
				//System.out.println("원본파일경로 : " + orgFile.getPath());
				//System.out.println("이동시킬 파일경로 : " + destFile.getPath());
								
			}
		}
	}
}

public class TestUnitFile {
	public static void main(String[] args) {
		FileService service = new FileService();
//		try {
//			service.testCreateFile();
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//service.moveFile();
		service.moveFiles();
	}
}
