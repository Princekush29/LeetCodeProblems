package programs;

import java.util.Scanner;

public class Practice2 {
	// The year is multiple of 400 OR
	// The year is a multiple of 4 and not a multiple of 100.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year");
		int year = sc.nextInt();

		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("Year is a leap year");
		} else {
			System.out.println("Not a leap year");
		}
	}
}