package programs;

public class MethodOverloading {

	public static void main(String[] args) {
		add(10, 12);
		add(10, 12, 11);
		add(1.4, 2.5);
		MethodOverloading(10);
	}

	public static void add(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}

	public static void add(double a, double b) {
		double c = a + b;
		System.out.println(c);
	}

	public static void add(int a, int b, int c) {
		int d = a + b + c;
		System.out.println(d);
	}

	public static void MethodOverloading(int a) {
		System.out.println(a);
	}
}
