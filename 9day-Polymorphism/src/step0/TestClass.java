package step0;

class Object{
	Object(){
		System.out.println("Object ������ ����");
	}
	public String getWord() {
		return "���ϰ�";
	}
}

class Object2 extends Object{
	Object2(){
		System.out.println("Object2 ������ ����");
	}
}

public class TestClass {
	public static void main(String[] args) {
		
		Object2 o = new Object2();
		System.out.println(o.getWord());
	}
}
