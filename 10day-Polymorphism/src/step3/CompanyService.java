package step3;

public class CompanyService {
	public void printDetailInfo(Employee e) {
		System.out.println(e);
	}
	public void printAnnualSalary(Employee e) {
		/*
		 * System.out.println("AnnualSalary : " + e.getAnnualSalary() + " Ãµ¿ø");
		 * 
		 * if(e instanceof Engineer) {
		 * 		System.out.println( ( e.getSalary() + ((Engineer)e).getBonus() ) * 12 );
		 * }
		 * else if(e instanceof Manager) {
		 * System.out.println ( e.getSalary() * 12 );
		 * }
		 * else if(e instanceof Employee) {
		 * System.out.println ( e.getSalary() * 12 );
		 * }
		 */
		
		int money = e.getSalary();
		if(e instanceof Engineer) {
			money +=((Engineer) e).getBonus();
		}
		System.out.println(money*12);
	}
}
