package step1;
/*
 * �ڹ� Ŭ������ ����
 * VO : Value Object ( ���� �����Ѵ� )
 * Service : ����Ͻ� ������ ����ϴ� ��ü
 * DAO : Data Access Object ������ ���� ��ü
 * DTO : Data Transfer Object ������ ���� ��ü
 * DAO�� DTO�� ������ �ߺ��Ǳ⵵ �Ѵ�.
 */

public class ItemVO {
	private String item;
	private int price;
	
	public ItemVO(String item, int price) {
		this.item = item;
		this.price = price;
	}
	 public void setItem(String item) {
		 this.item = item;
	 }
	 public void setPrice(int price) {
		 this.price = price;
	 }
	 public String getItem() {
		 return item;
	 }
	 public int getPrice() {
		 return price;
	 }

}
