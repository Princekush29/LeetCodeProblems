package programs.String;

public class Test1111 {

	public static void main(String[] args) {
		int number = 123; // o/p - 321
		int num = 0;

		while (number != 0) {
			int r = number % 10;
			num = num * 10 + r;
			number = number / 10;
		}
		System.out.println(num);
	}
}