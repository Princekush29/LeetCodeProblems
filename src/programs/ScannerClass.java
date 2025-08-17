package programs;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// int a = sc.nextInt();
		System.out.println("Type Name");
		String name = sc.nextLine();
		System.out.println("Name is " + name);

	}
}