package step8;

public class Product {
	private String name;
	private String maker;
	private int price;
	
	public Product(String name, String maker, int price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public int getPrice() {
		return price;
	}
}
