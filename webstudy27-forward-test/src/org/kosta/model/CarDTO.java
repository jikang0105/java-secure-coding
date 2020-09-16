package org.kosta.model;
/*
 * DTO : Data Transfer Object 
 * VO : Value Object
 */
public class CarDTO {
	private String carNo;
	private String model;
	private int price;
	public CarDTO() {
		super();
	}
	public CarDTO(String carNo, String model, int price) {
		super();
		this.carNo = carNo;
		this.model = model;
		this.price = price;
	}
	
	public CarDTO(String carNo, String model) {
		super();
		this.carNo = carNo;
		this.model = model;
	}
	public String getCarNo() {
		return carNo;
	}
	public void setCarNo(String carNo) {
		this.carNo = carNo;
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
		return "CarDTO [carNo=" + carNo + ", model=" + model + ", price=" + price + "]";
	}
}
