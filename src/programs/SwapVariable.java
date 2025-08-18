package programs;

public class SwapVariable {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;

		a = a + b; // a=30
		b = a - b; // b=10
		a = a - b; // a=20

		System.out.println(a);
		System.out.println(b);
	}
}