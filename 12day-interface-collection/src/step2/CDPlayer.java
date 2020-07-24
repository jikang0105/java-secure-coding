package step2;

public class CDPlayer implements Player {
	public void insertCd() {
		System.out.println("CD를 넣다");
	}
	@Override
	public void play() {
		System.out.println("cd를 재생하다.");
	}

}
