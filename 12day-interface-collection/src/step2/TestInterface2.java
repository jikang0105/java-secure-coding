package step2;

public class TestInterface2 {
	public static void main(String[] args) {
		Player [] pa = {new Youtube(), new CDPlayer()};
		pa[0].play();
		pa[1].play();
		//위처럼 개별 구현체를 파악하지 않아도 인터페이스만 파악하면 사용이 가능하다.
		for(int i = 0; i < pa.length; i++) {
			pa[i].play();
		}
	}
}
