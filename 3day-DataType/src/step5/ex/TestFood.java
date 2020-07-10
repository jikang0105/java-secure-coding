package step5.ex;

public class TestFood {
	public static void main(String[] args) {
		Food f = new Food("∏∆¡÷", 4000);
		System.out.println(f.getName() + " " + f.getPrice());
		f.setName("øÕ¿Œ");
		f.setPrice(10000);
		System.out.println(f.getName() + " " + f.getPrice());
	}
}
