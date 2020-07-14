package step8;

public class TestAggregation3 {
	public static void main(String[] args) {
		Shop shop = new Shop();
		shop.setName("유스페이스편의점");
		shop.setProduct(new Product("새우깡", "농심", 1000));
		System.out.println(shop.getName());//유스페이스편의점
		System.out.println(shop.getProduct().getName());//새우깡
		System.out.println(shop.getProduct().getMaker());//농심
		System.out.println(shop.getProduct().getPrice());//1000
		// 새우깡 가격을 1200으로 수정해본다.
		shop.getProduct().setPrice(1200);
		System.out.println(shop.getProduct().getPrice());//1200
	}
}
