package model;

import java.util.ArrayList;

public class CarDAO {
	private static CarDAO instance = new CarDAO();
	private CarDAO() {}
	public static CarDAO getInstance() {
		return instance;
	}
	public CarDTO getCarInfo(String maker) {
		CarDTO car = null;
		if(maker.contentEquals("현대")) {
			car=new CarDTO("소나타", 200);
		} else if (maker.contentEquals("기아")) {
			car=new CarDTO("K5", 300);
		} else if (maker.contentEquals("르노")) {
			car=new CarDTO("SM6", 700);
		}
		return car;
	}
	
	public ArrayList<CarDTO> getCarList(String maker) {
		ArrayList<CarDTO> carList=new ArrayList<CarDTO>();
		if(maker.contentEquals("현대")) {
			//car=new CarDTO("소나타", 200);
			carList.add(new CarDTO("소나타", 200));
			carList.add(new CarDTO("아반테", 100));
		} else if (maker.contentEquals("기아")) {
			//car=new CarDTO("K5", 300);
			carList.add(new CarDTO("k5", 200));
			carList.add(new CarDTO("k7", 600));
		} else if (maker.contentEquals("르노")) {
			carList.add(new CarDTO("sm6", 200));
			//car=new CarDTO("SM6", 700);
		}
		return carList;
	}
}
