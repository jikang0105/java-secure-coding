package step5;

class Animal{
	public void eat() {
		System.out.println("먹다");
	}
}
class Person extends Animal{
		public void eat() {
			System.out.println("사람이 먹다");
		}
}
class Dog extends Animal{
	public void eat() {
		System.out.println("개가 먹다");
	}
}
public class TestPloymorphismArray2 {
	public static void main(String[] args) {
		Animal [] a = {new Animal(), new Person(), new Dog()};
		// for 문을 이용해서 아래와 같이 출력하세요/
		/*
		 * 먹다
		 * 사람이 먹다
		 * 개가 먹다
		 */
		
		for(int i = 0; i < a.length; i++) {
			a[i].eat();
		}
		System.out.println("*************");
		ZooService service = new ZooService();
		service.pass(a);
	}
}

class ZooService{
	public void pass(Animal [] ani) {
		for(int i = 0; i < ani.length; i++) {
			ani[i].eat();
		}
	}
}
