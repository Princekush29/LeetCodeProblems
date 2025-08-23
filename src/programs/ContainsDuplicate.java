package programs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 3, 4, 5 };
		int count = 0;

		// Method 1
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = 1;
				}
			}
		}
		if (count == 1)
			System.out.println("Contains Duplicate");
		else
			System.out.println("Don't contain Duplicate");

		// Method 2 - Use map
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm);
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			System.out.println(hm1.getKey() + " " + hm1.getValue());
		}
		
		// Method 3 - using Set
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!s.contains(arr[i])) {
				s.add(arr[i]);
			} else {
				System.out.println("Duplicate number is " + arr[i]);
				break;
			}
		}

	}
}
