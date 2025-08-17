package programs;

import java.util.Arrays;
import java.util.Collections;

public class SortWordsInArray {
	public static void main(String[] args) {
		String names[] = { "Rahul", "Ajay", "Gourav", "Riya" };
		String temp;
		// Method1
		System.out.println(Arrays.toString(names));
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].compareTo(names[j]) > 0) {
					// swap
					temp = names[i];
					names[i] = names[j];
					names[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(names));
		System.out.println("++");

		// Method2
		// Sorts in ascending order
		Arrays.sort(names);
		System.out.println("Ascending order" + Arrays.toString(names));

		// Method 3
		// Sorts arr[] in descending order
		Arrays.sort(names, Collections.reverseOrder());
		System.out.println("Descending order" + Arrays.toString(names));

	}
}
