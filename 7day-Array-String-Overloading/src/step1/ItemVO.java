package step1;
/*
 * 자바 클래스명 관례
 * VO : Value Object ( 값을 저장한다 )
 * Service : 비즈니스 로직을 담당하는 객체
 * DAO : Data Access Object 데이터 제어 객체
 * DTO : Data Transfer Object 데이터 전송 객체
 * DAO와 DTO는 역할이 중복되기도 한다.
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
