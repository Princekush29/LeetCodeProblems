package leetCode;

public class MultiplyStrings43 {

	public static void main(String[] args) {

		String num1 = "123456789", num2 = "987654321";
		System.out.println(multiply(num1, num2));
	}

	public static String multiply(String num1, String num2) {

		int a = Integer.parseInt(num1);
		System.out.println(a);
		int b = Integer.parseInt(num2);
		System.out.println(b);
		Double c = (double) (a*b);
		return Double.toString(c);
	}
}