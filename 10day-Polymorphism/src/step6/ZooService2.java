package step6;

import step2.Animal;
import step2.Person;


public class ZooService2 {
	public void executeAll(Animal[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] instanceof Person) {
				((Person) arr[i]).buyTicket();
			}
			arr[i].play();
		}
	}
}
