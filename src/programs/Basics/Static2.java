package programs.Basics;

public class Static2 {

	static int a = 10;

	public static void main(String[] args) {
		Static2 s2 = new Static2();

		s2.subtract();
		System.out.println(a);
		Static1 s = new Static1();
		s.test();
	}

	public Static2() {
		System.out.println("I am default constructor");
	}

	public void subtract() {
		System.out.println("SUBTRACT");
	}
}