package model;
/*
 *  DTO : Data Transfer Object
 *  VO : Value Object
 *  
 *  위 두 이름은 정보를 저장하고 계층간 (또는 원격)에 정보를 이동하기 위한 객체
 */
public class ProductDTO {
	private String id;
	private String name;
	private String maker;
	private int price;

	public ProductDTO() {
		super();
	}
	
	public ProductDTO(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public ProductDTO(String id, String name, String maker, int price) {
		super();
		this.id = id;
		this.name = name;
		this.maker = maker;
		this.price = price;
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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDTO [id=" + id + ", name=" + name + ", maker=" + maker + ", price=" + price + "]";
	}
	
	
}
