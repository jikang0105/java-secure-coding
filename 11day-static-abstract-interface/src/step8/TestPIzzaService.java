package step8;

import step6.PizzaService;
import step7.PotatoPizza;
import step7.SeaFoodPizza;

public class TestPIzzaService {
	public static void main(String[] args) {
		PotatoPizza s1 = new PotatoPizza();
		s1.makePizza();
		System.out.println("************************");
		// step7 에  SeaFoodPizza를 구현해본다.
		SeaFoodPizza s2 = new SeaFoodPizza();
		s2.makePizza();
		// 다형성 적용 - 부모 타임으로 자식 객체를 참조시킬수 있다.
		PizzaService p = new PotatoPizza();
		p.makePizza();
		System.out.println("************************");
		PizzaService [] array = {new PotatoPizza(), new  SeaFoodPizza()};
		for(int i = 0; i < array.length; i++) {
			array[i].makePizza();
		}
	}
}
