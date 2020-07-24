package step5;

public class FlyerService {
	private int index;
	private Flyer[] array;
	FlyerService(int length){
		array = new Flyer[length];
	}
	public void addFlyer(Flyer f) {
		array[index++] = f;
	}
	public void executeFly() {
		for(int i = 0; i < index; i++) {
			array[i].fly();
		}
	}

	
}
