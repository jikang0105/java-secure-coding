package step5;

class Zoo{
	/*
	 * 이와 같이 객체의 종류가 새로 생성될 경우 이에 대응하는 처리 메서드는
	 * 계속 생성되어야 한다. 이는 시스템의 결합도가높아 유지보수성이 좋지 않다.
	 * public void pass(Person p) {
	 * 		p.eat();
	 * }
	 * public void pass(Monkey monkey) {
	 * monkey.eat();
	 * }
	 */
	// 아래와 캍이 다형성이 적용된 매개 변수로 처리하면 Animal 자식 객체의 수와
	// 관계없이 하나의 메서드(메세지 방식)에서 모두 처리할 수 있다.
	public void pass(Animal a) {
		a.eat();		
	}
	
}

public class TestPolymophism2 {
	public static void main(String[] args) {
		Zoo z = new Zoo();
		z.pass(new Person());
		z.pass(new Monkey());
		// 그 외 동물원에 다양한 구성원 객체가 있다고 가정한다.
	}
}
