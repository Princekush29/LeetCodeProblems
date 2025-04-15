package leetCode;

public class FibonacciNumber509 {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(fib(n));
		System.out.println(fib2(n));
	}

	public static int fib(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;

		long a = 0, b = 1;
		int c = 0;
		for (int i = 2; i <= n; i++) {
			c = (int) (a + b);
			// System.out.println(c);
			a = b;
			b = c;
		}
		return c;
	}

	public static int fib2(int n) {
		if (n <= 1)
			return n;
		return fib2(n - 1) + fib2(n - 2);
	}
}