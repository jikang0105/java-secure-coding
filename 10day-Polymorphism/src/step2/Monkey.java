package step2;

public class Monkey extends Animal {
	// 메서드 오버라이딩
	@Override // 어노테이션 ( Override 문법 check ) : 의미있는 주석
	public void play() {
		System.out.print("원숭이가 나무타며");
		super.play();
	}
}
