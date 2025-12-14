package programs;

public class This1 {

	int a = 2;

	public This1(int a) {
		System.out.println("Inside parametrized constructor " + a);
		System.out.println("Parameterized constructor");
	}

	public This1() {
		this(5);
		System.out.println("Default constructor");
	}

	public void test() {

		int a = 3;
		System.out.println(this.a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		This1 t1 = new This1();
		t1.test();
	}
}
