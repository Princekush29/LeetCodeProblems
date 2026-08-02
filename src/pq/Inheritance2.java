package pq;

class Four {
	public void print() {
		System.out.println("4444");
	}
}

class Five extends Four {
	public void print() {
		System.out.println("55555");
	}
}

public class Inheritance2 {
	public static void main(String args[]) {
		// Reference type = Four
		// Object type = Five
		Four four = new Five();
		four.print();
	}
}

/*
 * This is an example of method overriding and runtime polymorphism (dynamic
 * method dispatch). This is because static methods are hidden, not overridden.
 * Static method calls are resolved at compile time using the reference type
 * (Inheritance3.java), whereas instance methods are resolved at runtime using
 * the actual object (Inheritance2.java).
 * 
 * Interview Point Method Overriding → Runtime polymorphism → Decision based on
 * the object type. Static Method Hiding → Compile-time binding → Decision based
 * on the reference type.
 */
