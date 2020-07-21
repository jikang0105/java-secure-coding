package step2;

public class TestPolymophism6 {
	public static void main(String[] atgs) {
		ZooService service = new ZooService();
		service.execute(new Monkey());
		service.execute(new Tiger());
		service.execute(new Person());
		
	}
}
