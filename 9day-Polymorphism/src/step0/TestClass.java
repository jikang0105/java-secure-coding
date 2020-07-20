package step0;

class Object{
	Object(){
		System.out.println("Object 持失切 持失");
	}
	public String getWord() {
		return "軒渡葵";
	}
}

class Object2 extends Object{
	Object2(){
		System.out.println("Object2 持失切 持失");
	}
}

public class TestClass {
	public static void main(String[] args) {
		
		Object2 o = new Object2();
		System.out.println(o.getWord());
	}
}
