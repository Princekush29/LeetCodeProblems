package programs.String;

public class Test1111 {

	public static void main(String[] args) {
		System.out.println("Armstrong numbers from 1 to 1000:");
		int n, r, sum = 0;
		for (int i = 1; i <= 1000; i++) {
			n = i;
			while (n != 0) {
				r = n % 10;
				sum += (r * r * r);
				n = n / 10;
			}
			if (sum == i) {
				System.out.println("Armstrong number is " + i);
			}
			sum = 0;
		}
	}
}