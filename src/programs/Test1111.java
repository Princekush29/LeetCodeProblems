package programs;

import java.util.Scanner;

public class Test1111 {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("The num is " + num);
		long fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("The factorial is " + fact);
	}
}