package programs.Array;

import java.util.LinkedHashMap;
import java.util.Map;

class FirstNotRepeatingNumber {

	public static void main(String[] args) {

		int arr[] = { 9, 4, 9, 6, 5, 7, 4 }; //o/p=6
		int n = arr.length;

		System.out.println(firstNonRepeating(arr, n));
		System.out.println(firstNonRepeating1(arr, n));

	}

	static int firstNonRepeating(int arr[], int n) {
		// Loop for checking each element

		// Method1
		for (int i = 0; i < n; i++) {
			int j;
			for (j = 0; j < n; j++) {
				if (i != j && arr[i] == arr[j])
					break;
			}
			if (j == n)
				return arr[i];
		}

		return -1;
	}

	// Method2 - using LinkedHashMap
	static int firstNonRepeating1(int arr[], int n) {
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() == 1) {
				// System.out.println(hm1.getKey());
				return hm1.getKey();
			}
		}
		return -1;
	}

}
