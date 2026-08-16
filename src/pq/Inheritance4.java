package pq;

class Base1 {
	public Base1() {
		System.out.println("Base");
	}
}

class Derived1 extends Base1 {
	public Derived1() {
		System.out.println("Derived");
	}
}

class DeriDerived1 extends Derived1 {
	public DeriDerived1() {
		System.out.println("DeriDerived");
	}
}

public class Inheritance4 {
	public static void main(String[] args) {
		Derived1 b = new DeriDerived1();
	}
}

