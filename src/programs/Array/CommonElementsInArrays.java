package programs.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CommonElementsInArrays {

	public static void main(String[] args) {

		Integer[] a1 = { 1, 2, 3, 6, 5, 2, 1 };
		Integer[] a2 = { 1, 2, 6, 5, 3 };
		Integer[] a3 = { 1, 2, 3, 4, 6 };
		commonElementUsingMap(a1, a2, a3);
		commonElementUsingHashMap(a1, a2, a3);
		System.out.println(commonElement1(a1, a2, a3));
	}

	public static void commonElementUsingMap(Integer[] a1, Integer[] a2, Integer[] a3) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(a1));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(a2));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(a3));

        // Use the retainAll method to find the intersection
        // This modifies set1 to keep only elements present in set2
        set1.retainAll(set2);
        
        // This modifies the resulting set1 to keep only elements also present in set3
        set1.retainAll(set3);

        System.out.println("Common elements using HashSet: " + set1);
        
        
	}

	public static void commonElementUsingHashMap(Integer[] a1, Integer[] a2, Integer[] a3) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		Set<Integer> s = new HashSet<Integer>();

		for (int i = 0; i < a1.length; i++) {
			if (s.add(a1[i])) {
				hm.put(a1[i], 1);
			}
		}
		System.out.println(hm);
		// s.removeAll(s);
		for (int i = 0; i < a2.length; i++) {
			if (hm.containsKey(a2[i])) {
				hm.put(a2[i], hm.get(a2[i]) + 1);
			}
		}
		for (int i = 0; i < a3.length; i++) {
			if (hm.containsKey(a3[i])) {
				hm.put(a3[i], hm.get(a3[i]) + 1);
			}
		}
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() > 2)
				System.out.println(hm1.getKey());
		}
	}

	// this will work when array is sorted
	public static List<Integer> commonElement1(Integer[] a1, Integer[] a2, Integer[] a3) {

		Arrays.sort(a1);
		Arrays.sort(a2);
		Arrays.sort(a3);

		ArrayList<Integer> al = new ArrayList<>();
		int i = 0, j = 0, k = 0;
		while (i < a1.length && j < a2.length && k < a3.length) {
			if (a1[i] == a2[j] && a2[j] == a3[k]) {
				al.add(a1[i]);
				i++;
				j++;
				k++;
				while (i < a1.length && a1[i] == a1[i - 1])
					i++;
				while (j < a2.length && a2[j] == a2[j - 1])
					j++;
				while (k < a3.length && a3[k] == a3[k - 1])
					k++;
			} else if (a1[i] < a2[j])
				i++;
			else if (a2[j] < a3[k])
				j++;
			else
				k++;
		}
		return al;
	}
}