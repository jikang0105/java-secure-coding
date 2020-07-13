package step1;
/*
 *  AND와 OR연산
 *  
 *  AND 연산 -> 모두 true일 경우에만 true
 *  OR 연산 -> 모두 false일 경우에만 false
 *  
 *   and 연산( && )
 *   true && true -> true
 *   true && false - > false
 *   false && true -> false		--> 첫번째 연산만 진행한다. ( 후자의 식은 연산하지 않는다.)
 *   false && false -> false		--> 첫번째 연산만 진행한다. ( 후자의 식은 연산하지 않는다.)
 *   
 *   or 연산 ( || )
 *   true || true -> true		--> 첫번째 연산만 진행한다. ( 후자의 식은 연산하지 않는다.)
 *   true || false -> true		--> 첫번째 연산만 진행한다. ( 후자의 식은 연산하지 않는다.)
 *   false || true -> true
 *   false || false -> false
 */

class OperatorEx{
	public boolean test1() {
		System.out.println("test1");
		return false;
	}
	public boolean test2() {
		System.out.println("test2");
		return true;
	}
}

public class TestOperator2 {
	public static void main(String[] args) {
		OperatorEx ex = new OperatorEx();
		//System.out.println(ex.test1() && ex.test2()); // test1 false
		//System.out.println(ex.test1() || ex.test2()); // test1 test2 true
		System.out.println(ex.test2() || ex.test1()); // test2 true
	}
	

}
