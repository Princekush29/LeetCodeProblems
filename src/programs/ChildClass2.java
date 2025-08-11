package programs;

public class ChildClass2 extends ChildClass {

	static ChildClass2 cc = new ChildClass2();

	public static void main(String[] args) {
		test();
		System.out.println(b);
		test2();
	}

	public static void test2() {
		System.out.println("Inside Test2");
		cc.test3();
	}

	public void test3() {
		System.out.println(a);
	}
}