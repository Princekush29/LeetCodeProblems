package pq;

class Base {
	public Base() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public Derived() {
		System.out.println("Derived");
	}
}

class DeriDerived extends Derived {
	public DeriDerived() {
		System.out.println("DeriDerived");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		Derived b = new DeriDerived();
		// - Every constructor implicitly calls super() unless you specify otherwise.
		// - super() invokes the parent class constructor.

	}
}