package step4;

class GrandParent{
	GrandParent(){
		System.out.println("GrandParent ��ü ����");
	}
}

class Parent extends GrandParent{
	Parent(){
		System.out.println("Parent ��ü ����");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child ��ü ����");
	}
}

public class TestSuper2 {
	public static void main(String[] args) {
		Child c = new Child();
	}
}
