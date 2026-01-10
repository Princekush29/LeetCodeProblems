package programs.Basics;

public abstract class ObjectCreation {

	public static void main(String[] args) {
		
		A1 a = new B();
		// Fields are not polymorphic in Java & Fields are bound at compile time, not runtime.

		System.out.println(a.i);
		
		//methods are polymorphic and resolved at runtime
		System.out.println(a.getI());

		B b = new B();
		System.out.println(b.i);
		System.out.println(b.getI());
	}
}

class A1 {
	int i = 10;

	int getI() {
		return 10;
	}

}

class B extends A1 {
	int i = 20;

	int getI() {
		return 20;
	}

}