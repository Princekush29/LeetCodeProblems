package programs.Array;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.next();

		System.out.println("The name is " + name);
		System.out.println("Enter your marks");
		int marks = sc.nextInt();

		System.out.println("The marks is " + marks);

	}

}