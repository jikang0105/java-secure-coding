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
		System.out.println("�������� : " + minPrice + " / �ش���ǰ : " + item[minItem].getItem());
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
		System.out.println("�ְ��� : " + maxPrice + " / �ش���ǰ : " + item[maxItem].getItem());
		
	}
}
