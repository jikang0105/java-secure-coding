package step1;

public class TestRefArray5 {
	public static void main(String[] args) {
		ItemVO[] item = {
				new ItemVO("갤럭시9", 100),
				new ItemVO("아이폰8", 110),
				new ItemVO("G7", 50)
		};
		
		ItemService service = new ItemService();
		//service.printAllModel(item);
		service.printMaxPrice(item);
		service.printMinPrice(item);
		
	}
}
