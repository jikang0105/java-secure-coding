package model;

public class ProductVO {
	private String id;
	private String name;
	private String maker;
	private String price;
	public ProductVO(String id, String name, String maker, String price) {
		super();
		this.id = id;
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	public ProductVO() {
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", name=" + name + ", maker=" + maker + ", price=" + price + "]";
	}
	
	
}
