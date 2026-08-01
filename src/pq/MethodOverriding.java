package pq;

class Parent1 {
	public void className() {
		System.out.println("Parent");
	}
}

class Child1 extends Parent1 {
	public void className() {
		// it will give compile time error if we remove the public access modifier from
		// the child class method because we cannot reduce the visibility of the
		// inherited method.
		// void className(){
		System.out.println("Child");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		Parent1 parent1 = new Child1();
		parent1.className();
	}
}
