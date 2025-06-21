package leetCode;

public class ArgPara {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;

		// the variable x and y are the arguments
		int product = multiply(x, y);

		System.out.println("PRODUCT IS:" + product);
	}

	// the variables a and b are parameters
	public static int multiply(int a, int b) {
		return a * b;
	}
}