package programs;

public class Test {

	public static void main(String[] args) {
		int number = 123; // o/p - 321
		int rem = 0, newNum = 0;

		while (number != 0) {
			rem = number % 10;
			newNum = newNum * 10 + rem;
			number = number / 10;
		}
		System.out.println(newNum);
	}
}