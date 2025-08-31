package programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int number = 123; // o/p - 321
		int reminder = 0, newNumber = 0;
		while (number != 0) {
			reminder = number % 10;
			newNumber = newNumber * 10 + reminder;
			number = number / 10;
		}
		System.out.println(newNumber);
	}
}