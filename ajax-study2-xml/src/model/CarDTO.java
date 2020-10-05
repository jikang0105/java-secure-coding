package model;

public class CarDTO {
	private String model;
	private int Price;
	private String maker;
	public CarDTO(String model, int price) {
		super();
		this.model = model;
		Price = price;
	}
	public CarDTO(String model, int price, String maker) {
		super();
		this.model = model;
		Price = price;
		this.maker = maker;
	}
	public CarDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	@Override
	public String toString() {
		return "CarDTO [model=" + model + ", Price=" + Price + ", maker=" + maker + "]";
	}
}
