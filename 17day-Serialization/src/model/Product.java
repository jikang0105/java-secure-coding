package model;

import java.io.Serializable;

public class Product implements Serializable {
	
	private static final long serialVersionUID = 8440559517099448018L;
	private String id;
	private String name;
	private String maker;
	public Product(String id, String name, String maker) {
		super();
		this.id = id;
		this.name = name;
		this.maker = maker;
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
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", maker=" + maker + "]";
	}
	
	
}
