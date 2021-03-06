package test.json;

import java.util.ArrayList;

import org.json.JSONArray;

import model.CarDTO;

public class TestJSONArray {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("손흥민");
		list.add("황의조");
		list.add("기성용");
		//list 객체를 JSONArray로 변경하기 위해 생성자를 이용한다.
		JSONArray ja = new JSONArray(list);
		System.out.println(ja.toString());
		// ArrayList<CarDTO>
		ArrayList<CarDTO> carList=new ArrayList<CarDTO>();
		carList.add(new CarDTO("모닝", 200));
		carList.add(new CarDTO("스파크", 300));
		carList.add(new CarDTO("아우디", 500));
		JSONArray carArray=new JSONArray(carList);
		System.out.println(carArray.toString());
	}
}
