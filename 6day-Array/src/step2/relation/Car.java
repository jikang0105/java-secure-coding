package step2.relation;

public class Car {
	private String model;
	private Engine engine;
	/*
	 *  Car와 Engine은 composition 관계 ( consist of ~ 구성되다 )
	 *  Car에서 Engine은 필수적인 구성요소이므로
	 *  Car 생성자 ( Car객체 생성시 실행되는 요서 ) 가 실행될 때
	 *  먼저 Engine 객체부터 생성되도록 구현한다.
	 */
	public Car(String model) {
		this.model = model;
		this.engine = new Engine("L4", "2000");
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
