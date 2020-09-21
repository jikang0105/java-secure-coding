package model;

public class CarVO {
	private String carNO;
	private String model;
	private int price;
	public CarVO() {
		super();
	}
	public CarVO(String carNO, String model, int price) {
		super();
		this.carNO = carNO;
		this.model = model;
		this.price = price;
	}
	public String getCarNO() {
		return carNO;
	}
	public void setCarNO(String carNO) {
		this.carNO = carNO;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CarVO [carNO=" + carNO + ", model=" + model + ", price=" + price + "]";
	}
}
