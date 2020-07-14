package step2;

public class Car {
	// 인스턴스 변수이므로 선언만 하면 기본 초기화 false ( boolean 타입이므로 )
	private boolean flag;
	// 인스턴스 변수이고 실수형이므로 0.0으로 기본 초기화된다.
	private double price;
	// 인스턴스 변수, 참조형이므로 null 로 기본 초기화된다.
	private String model;
	// boolean 형은 get메서드가 아니라 is메서드를 정의한다.
	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	
	
}
