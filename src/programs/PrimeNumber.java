package programs;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(prime(17));
		System.out.println(prime(18));
	}

	public static boolean prime(int number) {

		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}