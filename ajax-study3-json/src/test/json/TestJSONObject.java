package test.json;

import org.json.JSONObject;

import model.CarDTO;

public class TestJSONObject {
	public static void main(String[] args) {
		JSONObject json1 = new JSONObject();
		json1.put("model", "소나타");
		json1.put("price", 200);
		System.out.println(json1.toString());
		// DTO 또는 VO계열의 객체를 JSONObject로 변환 -> JSONObject의 생성자를 이용하면 된다.
		CarDTO car = new CarDTO("k5", 500);
		JSONObject json2 = new JSONObject(car);
		System.out.println(json2.toString());
	}
}
