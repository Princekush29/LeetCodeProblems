package programs.Others;

//Parent class
class Parent {
	String name = "Parent";
	int id = 99;

	void method() {
		System.out.println("Method from Parent");
	}
}

//Child class
class Child extends Parent {

	int id = 100;
	String name = "Child";

	@Override
	void method() {
		System.out.println("Method from Child");
	}

}

public class UpCastingDownCasting {

	// Driver code
	public static void main(String[] args) {
		// Upcasting
		Parent p = new Child();
		p.name = "GeeksforGeeks";

		// Printing the parentclass name
		System.out.println(p.name);
		// this will print 'method from child',
		// however if in child class the Method is commented (), then it will print
		// 'Method from parent'
		p.method();

		// Trying to Downcasting Implicitly
		// Child c = new Parent(); - > compile time error

		// Downcasting Explicitly - it gives preference to Child variable and method BUT
		// when the variable and method is not present in child class then it takes from
		// Parent class

		Parent p1 = new Child();
		Child c = (Child) p1;

		c.id = 1;
		System.out.println(c.name);
		System.out.println(c.id);
		c.method();

		test();
	}

	public static void test() {
		/*
		 * In Java, downcasting is dangerous because the compiler cannot guarantee that
		 * the object being held by a parent reference is actually the child type you
		 * claim it is.
		 * 
		 * If you guess wrong, the program crashes with a ClassCastException. The
		 * instanceof operator acts as a safety check to prevent this.
		 * 
		 */
		Parent p = new Parent(); // This is NOT a Child

		// Dangerous: This will compile but CRASH at runtime
		// java.lang.ClassCastException
		// Child c1 = (Child) p;

		// Safe: Use instanceof to check before downcasting
		if (p instanceof Child) {
			Child c = (Child) p;
			System.out.println("Downcasting successful");
		} else {
			System.out.println("Downcasting skipped: Object is not a Child");
		}
	}
}