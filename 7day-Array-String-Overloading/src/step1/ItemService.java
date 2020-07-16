package step1;

public class ItemService {		
	
	public void printAllModel(ItemVO[] item) {
		for(int i = 0; i < item.length; i++) {
			System.out.println(item[i].getItem());
		}
	}
	
	public void printMinPrice(ItemVO[] item) {
		int minPrice = Integer.MAX_VALUE;
		int minItem = 0;
		for(int i = 0; i < item.length; i++) {
			if(item[i].getPrice() < minPrice) {
				minPrice = item[i].getPrice();
				minItem = i;
			}
		}
		System.out.println("최저가격 : " + minPrice + " / 해당제품 : " + item[minItem].getItem());
	}
	
	public void printMaxPrice(ItemVO[] item) {
		int maxPrice = Integer.MIN_VALUE;
		int maxItem = 0;
		for(int i = 0; i < item.length; i++) {
			if(item[i].getPrice() > maxPrice) {
				maxPrice = item[i].getPrice();
				maxItem = i;
			}
		}
		System.out.println("최고가격 : " + maxPrice + " / 해당제품 : " + item[maxItem].getItem());
		
	}
}
