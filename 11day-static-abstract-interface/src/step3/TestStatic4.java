package step3;

class Fish{
	// Object의 member로 객체 생성시 heap 영역의 각자 객체 공간에
	// 새롭게 각각 초기화된다.
		int count;
	// 실행 첫 시점에 class loading 때 static이 초기화된다.
	static int sCount;
	Fish(){
		count++;
		sCount++;
	}
}

public class TestStatic4 {
	public static void main(String[] args) {
		Fish f1 = new Fish();
		System.out.println(f1.count);
		System.out.println(f1.sCount);
		System.out.println(Fish.sCount);
		Fish f2 = new Fish();
		System.out.println(f2.count);
		System.out.println(f2.sCount);
		System.out.println(Fish.sCount);
		System.out.println(f1.sCount);
		Fish f3 = new Fish();
		System.out.println(f3.count);
		System.out.println(f3.sCount);
		System.out.println(Fish.sCount);
		System.out.println(f2.sCount);
		System.out.println(f1.sCount);
	}

}
