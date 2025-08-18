package programs;

public abstract class ObjectCreation {

	public static void main(String[] args) {
		A1 a = new B();
		System.out.println(a.i);
	}
}

class A1 {
	int i = 10;
}

class B extends A1 {
	int i = 20;
}