package pq;

public class Exception {

	public static void main(String args[]) {
		test2();
		test1();
	}

	public static void test2() {
		try {
			int a, b;
			b = 0;
			a = 5 / b;
			System.out.print("Apple ");
		} catch (ArithmeticException e) {
			System.out.println("Ball");
		}
	}

	public static void test1() {
		try {
			System.out.print("Hello" + " " + 1 / 0);
		} catch (ArithmeticException e) {
			System.out.println("World");
		}
	}
	/*
	 * Java evaluates the entire expression before passing it to System.out.print.
	 * That means: - "Hello" + " " is fine. - But 1 / 0 triggers an
	 * ArithmeticException before any part of the string is printed. 🧠 Key Insight:
	 * - The exception is thrown during expression evaluation, not during the actual
	 * print call. - So System.out.print(...) never gets a chance to execute. -
	 * Control jumps directly to the catch block, which prints "World".
	 * 
	 */
}
