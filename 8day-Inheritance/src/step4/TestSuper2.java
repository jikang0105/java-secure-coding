package step4;

class GrandParent{
	GrandParent(){
		System.out.println("GrandParent 梓端 持失");
	}
}

class Parent extends GrandParent{
	Parent(){
		System.out.println("Parent 梓端 持失");
	}
}

class Child extends Parent{
	Child(){
		System.out.println("Child 梓端 持失");
	}
}

public class TestSuper2 {
	public static void main(String[] args) {
		Child c = new Child();
	}
}
