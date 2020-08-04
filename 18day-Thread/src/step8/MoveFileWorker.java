package step8;

import java.io.File;

public class MoveFileWorker implements Runnable {

	private int moveCount;
	private int movePeriod;
	
	public MoveFileWorker(int moveCount, int movePeriod) {
		this.moveCount = moveCount;
		this.movePeriod = movePeriod;
	}
	
	public void run() {
		File dir1 = new File(CommonInfo.MOVIE_PATH);
		if(dir1.isDirectory() == false) {
			dir1.mkdir();
		}
		File dir2 = new File(CommonInfo.MUSIC_PATH);
		if(dir2.isDirectory() == false) {
			dir2.mkdir();
		}
		for(int i = 0; i < moveCount; i++) {
			try {
				Thread.sleep(movePeriod);
				// ������丮���� ���ϵ鸸 Ȯ���ں��� �̵�.
				moveFiles();
				System.out.println("������ ���丮�� ���ϵ��� �̵��߽��ϴ�.");
			} catch (InterruptedException e) {
				e.printStackTrace();
			} //catch
		} // for
	} // run
	
	public void moveFiles() {
		File orgDir = new File(CommonInfo.MAKE_PATH);
		String movieDir = CommonInfo.MOVIE_PATH;
		String musicDir = CommonInfo.MUSIC_PATH;
				
		File[] list = orgDir.listFiles();
		for(int i = 0; i < list.length; i++) {
			if(list[i].isFile()) {
				String name = list[i].getName();
				File destFile = null;
				if(name.endsWith(".mp3")) {
					destFile = new File(musicDir+File.separator+name);
				} else if(name.endsWith("avi")){
					destFile = new File(movieDir+File.separator+name);
				}
				list[i].renameTo(destFile);
				
			}
		}
	}

}
