package programs;

//Parent class
class Parent {
	String name;

	void method() {
		System.out.println("Method from Parent");
	}
}

//Child class
class Child extends Parent {
	int id;

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

		// Downcasting Explicitly

		Parent p1 = new Child();
		Child c = (Child) p1;

		c.id = 1;
		System.out.println(c.name);
		System.out.println(c.id);
		c.method();

	}
}