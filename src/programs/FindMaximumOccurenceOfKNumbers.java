package programs;

import java.util.HashMap;
import java.util.Map;

public class FindMaximumOccurenceOfKNumbers {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 2, 3, 1, 4 };
		int k = 2; // o/p - 4 and 2
		findOccurence(arr, k);
	}

	public static void findOccurence(int arr[], int k) {

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm);
		for (int i = 0; i < k; i++) {
			int maxKey = 0;
			int maxValue = 0;

			for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
				if (maxValue < hm1.getValue()) {
					maxValue = hm1.getValue();
					maxKey = hm1.getKey();
				}
			}
			System.out.println("Number " + maxKey + " is present " + maxValue + " times");
			hm.remove(maxKey);
		}
	}
}