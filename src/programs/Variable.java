package programs;

public class Variable {

	static int apple; // Initialization is mandatory only for static variable
	int color;// Initialization is NOT mandatory only for instance variable

	static Variable t = new Variable();

	public static void main(String[] args) {
		int test = 0; // Initialization is mandatory only for local variable
		System.out.println(test);
		System.out.println(apple);
		t.test();
	}

	public void test() {
		int test11;
		System.out.println(color);
	}
}