package step8;

import step6.PizzaService;
import step7.PotatoPizza;
import step7.SeaFoodPizza;

public class TestPIzzaService {
	public static void main(String[] args) {
		PotatoPizza s1 = new PotatoPizza();
		s1.makePizza();
		System.out.println("************************");
		// step7 ��  SeaFoodPizza�� �����غ���.
		SeaFoodPizza s2 = new SeaFoodPizza();
		s2.makePizza();
		// ������ ���� - �θ� Ÿ������ �ڽ� ��ü�� ������ų�� �ִ�.
		PizzaService p = new PotatoPizza();
		p.makePizza();
		System.out.println("************************");
		PizzaService [] array = {new PotatoPizza(), new  SeaFoodPizza()};
		for(int i = 0; i < array.length; i++) {
			array[i].makePizza();
		}
	}
}
