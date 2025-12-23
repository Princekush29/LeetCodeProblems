package programs;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 30, 35, 12, 18, 19, 10, 19 };
		// Example output: {20, 30, 35, 12, 18} - print element which are present once - Method 2
		//[18, 35, 19, 20, 10, 12, 30] - print element atleast once - Method1

		//Method 1
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		System.out.println("Array after removing element"+set);
		
		// Method 2
		Map<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm);
		int k;
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() == 1) {
				System.out.println(hm1.getKey());
			}
		}
		// Method 3
		int a[] = { 5, 2, 6, 8, 6, 7, 5, 2, 8 };
		int n = a.length;

		// m will have the maximum element in the array.
		int m = 0;
		for (int i = 0; i < n; i++) {
			m = Math.max(m, a[i]);
		}
		// creating the frequency array
		int[] f = new int[m + 1];

		// incrementing the value at a[i]th index
		// in the frequency array
		for (int i = 0; i < n; i++) {
			f[a[i]]++;
		}
		for (int i = 0; i < m + 1; i++) {

			// if the frequency of the particular element
			// is greater than 0, then print it once
			if (f[i] > 0) {
				System.out.print(i + " ");
			}
		}
	}
}
