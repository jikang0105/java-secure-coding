package test.demo;
// FrontController를 분화시키는 과정을 확인하는 예제
class FrontServlet{
	public void handleRequest(String command) {
		if(command.contentEquals("select")) {
			System.out.println("차량정보조회작업");
		} else if(command.contentEquals("register")) {
			System.out.println("차량등록작업");
		}
	}
}
// 위 FrontServlet에서 모든 컨트롤러 로직을 처리한다면 코드량 증가 및 유지보수성이 낮아진다.
// 아래 코드처럼 컨트롤러 로직을 분리시킨다.
class FrontServletVer2{
	public void handleRequest(String command) {
		Controller c = null;
		if(command.contentEquals("select")) {
			c = new SelectCarController();
		} else if(command.contentEquals("register")) {
			c = new  RegistCarController();
		}
		c.execute(); // 다양한 컨트롤러 구현체를 단일한 방법으로 실행한다.
	}
}
interface Controller{
	public void execute();
}
class SelectCarController implements Controller{
	@Override
	public void execute() {
		System.out.println("차량정보조회작업");
	}	
}
class RegistCarController implements Controller{
	@Override
	public void execute() {
		System.out.println("차량등록작업");		
	}	
}
// FrontServletVer2에서 기존에 작업하던 개별 컨트롤러 로직을
// 별도의 클래스(SelectController, RegistController ...)에서
// 담당하게 하고 자신은 인터페이스에서 명시한 단일한 방법(execute())으로 실행하는 역할을 한다.
// but Ver2에서는 사용자가 요청한 작업을 처리할 개별컨트롤러 객체를 생성해야 하는 코드가 증가될 수 있다.
// Ver3에서는 객체 생성을 전담하는 Factory(객체공장)를 만들어 다시 역할을 분리한다.
class FrontServletVer3{
	public void handleRequest(String command) {
		Controller c = HandlerMapping.getInstance().create(command);		
		c.execute(); // 다양한 컨트롤러 구현체를 단일한 방법으로 실행한다.
	}
}
// 객체 생성을 전담하는 공장 (Factory) : FrontServlet(Ver3)과 개별 컨트롤러와의 결합도를 낮춘다.
class HandlerMapping{
	private static HandlerMapping instance = new HandlerMapping();
	private HandlerMapping() {}
	public static HandlerMapping getInstance() {
		return instance;
	}
	public Controller create(String command) {
		Controller c = null;
		if(command.contentEquals("select")) {
			c = new SelectCarController();
		} else if(command.contentEquals("register")) {
			c = new  RegistCarController();
		}
		return c;
	}
}
public class TestDemoFactory {
	public static void main(String[] args) {
		FrontServletVer3 v3 = new FrontServletVer3();
		v3.handleRequest("select");
		v3.handleRequest("register");
	}
}
