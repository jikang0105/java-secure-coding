package step7;

import step6.PizzaService;

public class PotatoPizza extends PizzaService {
	@Override
	protected void topping() {
		System.out.println("���� ������ �ø���");
	}
}
