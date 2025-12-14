package pq;

class Parent {
	public void className() {
		System.out.println("Parent");
	}
}

class Child extends Parent {
	void className() {
		System.out.println("Child");
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.className();
	}
}
