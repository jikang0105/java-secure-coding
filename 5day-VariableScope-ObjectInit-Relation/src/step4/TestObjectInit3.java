package step4;

public class TestObjectInit3 {
	public static void main(String[] args) {
		Food f = new Food("Â«»Í", 7000);
		f.setName("Â¥Àå¸é");
		System.out.println(f.getName() + " " + f.getPrice()); // Â¥Àå¸é 7000
		Food f1 = new Food("ÅÁ¼öÀ°", 10000);
		f = f1;
		// ½ÇÇà°á°ú ¿¹»ó
		System.out.println(f.getName() + " " + f.getPrice()); // ÅÁ¼öÀ° 10000
	}
}
