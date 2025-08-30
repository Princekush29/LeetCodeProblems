package programs;

import java.util.Arrays;

public class CountMaximumConsecutiveOccurrence {

	public static void main(String[] args) {
		// count maximum occurrence of 1 in an array
		int count = 0, newCount = 0;
		int input[] = { 1, 1, 2, 3, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1 };
		for (int i = 0; i < input.length; i++) {
			if (input[i] == 1) {
				count++;
			} else {
				count = 0;
			}
			// we can use either below if condition or Math.max
			if (count > newCount) {
				newCount = count;
			}

			newCount = Math.max(count, newCount);
		}
		System.out.println(newCount);

		// count maximum occurrence of any number present in the array
		int arr[] = { 1, 1, 2, 3, 3, 4, 4, 5, 6, 5, 5, 5, 5, 5, 5 };
		int number[] = new int[10];

		for (int i = 0; i < arr.length; i++) {
			/*
			 * char digit = (char) (arr[i] + '0'); int ascii = (int) (digit);
			 * System.out.println(ascii); number[ascii - '0']++;
			 */
			number[arr[i] - 0]++;
		}
		int highest = number[0], value = 0;
		System.out.println(Arrays.toString(number));
		for (int i = 0; i < number.length; i++) {

			if (highest < number[i]) {
				highest = number[i];
				value = i;
			}
		}
		System.out.println(value + " is present " + highest + " times");
	}

}
