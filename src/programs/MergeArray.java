package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MergeArray {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 3, 2, 6, 8 };
		int arr2[] = { 10, 11, 3, 2, 4, 6 };

		// Method 0 - using java streams
		 List<Integer> list1 = new ArrayList<>();

	        for (int i : arr1) {
	            list1.add(i); // Auto-boxing from int to Integer
	        }
	        List<Integer> list2 = new ArrayList<>();

	        for (int i : arr2) {
	            list2.add(i); // Auto-boxing from int to Integer
	        }
		
		Stream stream = Stream.concat(list1.stream(), list2.stream());

		stream.sorted().forEach(s -> System.out.println(s));

		System.out.println("---");

		// Method 1
		int arr3[] = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		int len = arr1.length;
		for (int i = 0; i < arr2.length; i++, len++) {
			arr3[len] = arr1[i];
		}

		int temp;
		for (int i = 0; i < arr3.length; i++) {
			for (int j = i + 1; j < arr3.length; j++) {
				if (arr3[i] > arr3[j]) {
					temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}
}
