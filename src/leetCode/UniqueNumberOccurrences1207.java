package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOccurrences1207 {

	public static void main(String[] args) {
		int arr[] = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };
		System.out.println(uniqueOccurrences(arr));
	}

	public static boolean uniqueOccurrences(int[] arr) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm);
		Set<Integer> s = new HashSet<Integer>();
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			s.add(hm1.getValue());
		}
		return hm.size() == s.size();

	}
}