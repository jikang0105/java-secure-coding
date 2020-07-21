package step6;

import step2.Animal;
import step2.Monkey;
import step2.Person;
import step2.Tiger;

public class TestPolymorphismArray3 {
	public static void main(String[] args) {
		Animal arr[] = {new Tiger(), new Monkey(), new Person()};
		ZooService2 service = new ZooService2();
		service.executeAll(arr);
	}
}
