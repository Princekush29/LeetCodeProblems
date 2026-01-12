package programs.Basics;

public class ChildClass2 extends ChildClass {

	static ChildClass2 cc = new ChildClass2();
	static int b=30;
	//int a =40;
	public static void main(String[] args) {
		test();
		System.out.println(b);
		test2();
	}

	/*public static void test() {
		System.out.println("Inside Test : childclass2");
	}*/
	public static void test2() {
		System.out.println("Inside Test2 present under child class2");
		cc.test3();
	}

	public void test3() {
		System.out.println(a);
	}
}