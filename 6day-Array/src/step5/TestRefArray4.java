package step5;

public class TestRefArray4 {
	public static void main(String[] args) {
		Product[] p = {
				new Product("맥주", 3000),
				new Product("와인", 7000),
				new Product("막걸리", 2000),
		};
		Shop shop = new Shop();
		shop.printAvgPrice(p); // 상품가격  원
		
	}
}
