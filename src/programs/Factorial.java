package programs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		long n = sc.nextLong();
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
		factorial();
	}

	public static void factorial() {
		System.out.println("Factorail method started");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}
}