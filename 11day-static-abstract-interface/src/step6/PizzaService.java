package step6;

// abstract class : 자식에게 유용한 벰버를 상속시키고 스스로 직접 객체화되지 않는다
//					자식 객체생성을 통해서 객체 생성은 된다.
public abstract class PizzaService {
	
	protected void prepare() {
		System.out.println("도우를 만들다");
	}
	// 부모 차원에서 구현할 수 없고, 반드시 자식 클래스에서
	// 구현해야 하는 메서드이므로 abstract method로 선언한다.
	protected abstract void topping();
	protected void bake() {
		System.out.println("굽다");
	}
	protected void cutting() {
		System.out.println("자르다");
	}
	protected void boxing() {
		System.out.println("포장하다");
	}
	// 외부에서 편리하게 사용할 수 있도록 메서드를 제공한다.
	// 템플릿 메서드 template method : 작업 절차(or 처리 흐름)를 정의
	// 템플릿 메서드는 피자의 작업 절차를 정의해서 자식에게 물려준다.
	public void makePizza() {
		prepare();
		topping();
		bake();
		cutting();
		boxing();
	}
}
