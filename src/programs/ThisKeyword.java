package programs;

public class ThisKeyword {
	public static void main(String[] args) {
		A a = new A(10);		
	}

}

class A {
	A() {
		System.out.println("I am a default constructor");
	}

	A(int a) {
		this();
		System.out.println("I am a parameterized constructor");
		System.out.println("A is " + a);
	}
}