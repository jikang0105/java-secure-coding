package model;
/*
 *  테스트를 위한 fake DAO
 */
public class MockDAO {
	public String findInfo(String id) {
		return id + " 아이유 판교";
	}
	public void insertCustomerInfo(String customerInfo) {
		System.out.println(customerInfo + " database table에 insert");
	}
}
