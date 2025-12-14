package pq;

public class Exception {

	public static void main(String args[]) {
		try {
			int a, b;
			b = 0;
			a = 5 / b;
			System.out.print("Apple ");
		} catch (ArithmeticException e) {
			System.out.print("Ball");
		}
	}
}
