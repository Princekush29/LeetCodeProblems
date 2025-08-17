package programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountDuplicateWithoutHashMap {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 25, 30, 25, 25, 35, 40, 40, 2555 };
		int size;
		size = arr.length;
		System.out.println(size);
		// Method1
		Arrays.sort(arr);
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					i++;
				}
			}
			System.out.println(arr[i] + " " + count);
			count = 1;
		}
		System.out.println("+++");
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			s.add(arr[i]);
		}

		// Print method 1
		System.out.println(s);
		System.out.println("++++");

		// Print method 2
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("++++++++++++++++");
	}
}