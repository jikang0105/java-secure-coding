package step1;
/*
 *  AND�� OR����
 *  
 *  AND ���� -> ��� true�� ��쿡�� true
 *  OR ���� -> ��� false�� ��쿡�� false
 *  
 *   and ����( && )
 *   true && true -> true
 *   true && false - > false
 *   false && true -> false		--> ù��° ���길 �����Ѵ�. ( ������ ���� �������� �ʴ´�.)
 *   false && false -> false		--> ù��° ���길 �����Ѵ�. ( ������ ���� �������� �ʴ´�.)
 *   
 *   or ���� ( || )
 *   true || true -> true		--> ù��° ���길 �����Ѵ�. ( ������ ���� �������� �ʴ´�.)
 *   true || false -> true		--> ù��° ���길 �����Ѵ�. ( ������ ���� �������� �ʴ´�.)
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
