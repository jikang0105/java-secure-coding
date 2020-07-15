package step5;

public class Shop {
	public void printAvgPrice(Product[] p) {
		int totalPrice = 0;
		for(int i = 0; i < p.length; i++) {
			totalPrice += p[i].getPrice(); 
		}
		//int avgPrice = totalPrice / p.length;
		System.out.println("상품평균가격 : " + totalPrice / p.length + "원");
	}
}
