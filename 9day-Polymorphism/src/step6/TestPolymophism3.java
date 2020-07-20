package step6;

class Employee{
	
}
class Engineer extends Employee{
	
}
class Manager extends Employee{
	
}
class Secretary extends Employee{
	
}
class CompanyService{
	// 다형성이 적용되므로 사원의 종류가 여러개라도 하나의 메서드에서
	// 모두 처리할 수 있다.
	public void register(Employee e) {
		// instanceof 연산자를 이용해 객체의 타입을 확인해보자
		if(e instanceof Engineer) {
			System.out.println("엔지니어 객체입니다.");
		}else if(e instanceof Manager){
			System.out.println("매니저 객체입니다.");
		}else if(e instanceof Secretary) {
			System.out.println("비서 객체입니다.");
		}else if(e instanceof Employee) {
			System.out.println("사원 객체입니다.");
		}
		System.out.println(e + " 등록완료");
	}
}
public class TestPolymophism3 {
	public static void main(String[] args) {
		CompanyService service = new CompanyService();
		service.register(new Employee());
		service.register(new Engineer());
		service.register(new Manager());
		service.register(new Secretary());
	}
}
