package step4;

public class CreditCard {
	private String customerInfo;
	// constructor
	// 생성자에 매개변수가 정의되어서
	// 객체 생성시에는 매개변수에 알맞는 정보를 
	// 전달할 때만 객체 생성할 수 있다.
	public CreditCard(String customerInfo) {
		this.customerInfo = customerInfo;
	}
	// getter
	public String getCustomerInfo() {
		return customerInfo;
	}
	// setter
	public void setCustomerInfo(String customerInfo) {
		this.customerInfo = customerInfo;
	}
}
