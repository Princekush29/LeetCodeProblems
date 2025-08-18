package programs;

public class PrimeNumberSum {
	public static void main(String[] args) {

		int num = 34;
		for (int i = 2; i < num; i++) {
			if (isPrime(i) && isPrime(num - i)) {
				System.out.println(i);
				System.out.println(num - i);
				break;
			}
		}
	}

	public static boolean isPrime(int number) {
		if (number <= 1)
			return false;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
