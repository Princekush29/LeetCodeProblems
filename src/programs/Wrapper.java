package programs;

public class Wrapper {

	public static void main(String[] args) {
		int a = 10;
		Integer b = a;
		System.out.println(a);
		System.out.println(b);

		Integer c = 20;
		int d = c;

		System.out.println(c);
		System.out.println(d);

		System.out.println("---");
		test();
	}

	public static void test() {
		int abc = 30;
		Integer def = abc;
		System.out.println(abc);
		System.out.println(def);

		Integer xyz = 40;
		int pqrs = xyz;
		System.out.println(xyz);
		System.out.println(pqrs);
	}
}
