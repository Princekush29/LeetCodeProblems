package leetCode;

public class HappyNumber202 {
	public static void main(String[] args) {
		int n = 2;
		System.out.println(isHappy(n));
	}

	public static boolean isHappy(int n) {
		int newNumber = 0, reminder;
		if (n == 1 || n == 7)
			return true;
		for (int i = 0; i < 10; i++) {
			if (n != 1) {
				while (n != 0) {
					reminder = n % 10;
					newNumber = newNumber + (reminder * reminder);
					n = n / 10;
				}
				n = newNumber;
				newNumber = 0;

			} else if (n == 1) {
				return true;
			}
		}
		System.out.println(newNumber);
		return false;
	}
}