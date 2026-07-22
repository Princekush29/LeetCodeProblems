package programs.Basics;

class Parent1 {
	void displaye() {
		System.out.println("Parent");
	}
}

class Child1 extends Parent1 {
	void displaye() {
		System.out.println("Child");
	}
}

public class Static4 {
	public static void main(String[] args) {
		Parent1 p = new Child1();
		p.displaye();
	}
}