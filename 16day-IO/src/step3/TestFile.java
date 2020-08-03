package step3;

import java.io.File;

public class TestFile {
	public static void main(String[] args) {
		// java.io.File class : 파일을 제어하는 기능을 제공한다.
		String path = "C:" + File.separator + "kosta203";
		File dir = new File(path);
		
		System.out.println(dir.exists());
		
		System.out.println(dir.isFile());
		
		System.out.println(dir.isDirectory());
		
		System.out.println(dir.getPath());
		
		String path2 = dir.getPath() + File.separator + "iotest2";
		File dir2 = new File(path2);
		
		System.out.println(dir2.mkdirs());
		
		// 상위 디렉토리로 이동해서 파일객체를 반환한다.
		File dir3 = dir2.getParentFile();
		
		System.out.println(dir3.getPath());
		
		// kosta203 디렉토리에 있는 파일 및 디렉토리 정보를 모두 나열한다.
		String array[] = dir.list();
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		File array2[] = dir3.listFiles();
		for(int i = 0; i < array.length; i++) {
			if(array2[i].isFile()) {
				System.out.println("file : " + array2[i].getName());
			} else {
				System.out.println("directory : " + array2[i].getName());
			}
			
		}
	}
}
