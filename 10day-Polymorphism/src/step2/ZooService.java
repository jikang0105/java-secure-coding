package step2;

public class ZooService {
	public void execute(Animal a) {
		if(a instanceof Person) {
			((Person) a).buyTicket();
		}
		a.play();
	}
}
