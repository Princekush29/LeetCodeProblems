package programs;

import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		int arr1[] = { 1, 4, 3, 2, 6, 8 };
		int arr2[] = { 10, 11, 3, 2, 4, 6 };

		int arr3[] = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[i];
		}
		int j = arr1.length;
		for (int i = 0; i < arr2.length; i++) {
			arr3[j] = arr2[i];
			j++;
		}
		System.out.println(Arrays.toString(arr3));
		Arrays.sort(arr3);
		System.out.println(Arrays.toString(arr3));
		System.out.println(Collections.singleton(arr3));
		System.out.println(Arrays.asList(arr3));
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] +" ");
		}
		System.out.println();
		for(Integer i :arr3) {
			System.out.print(i + " ");
		}

	}
}