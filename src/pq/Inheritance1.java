package pq;

class One {
	public One() {
		System.out.print("One,");
	}
}

class Two extends One {
	public Two() {
		System.out.print("Two,");
	}
}

class Three extends Two {
	public Three() {
		System.out.print("Three");
	}
}

public class Inheritance1 {

	public static void main(String[] args) {
		Three three = new Three();
		// - Every constructor implicitly calls super() unless you specify otherwise.
		// - super() invokes the parent class constructor.
	}
}