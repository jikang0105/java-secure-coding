package model;

public class CarVO {
	private String id;
	private String owner;
	private String model;
	private String address;
	public CarVO(String id, String owner, String model, String address) {
		super();
		this.id = id;
		this.owner = owner;
		this.model = model;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
