package programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Test1111 {

	public static void main(String[] args) {

		Integer[] a1 = { 1, 2, 3, 6, 5, 2, 1 };
		Integer[] a2 = { 1, 2, 6, 5, 3 };
		Integer[] a3 = { 1, 2, 3, 4, 6 };
		commonElementUsingMap(a1, a2, a3);
		commonElementUsingHashMap(a1, a2, a3);
	}

	public static void commonElementUsingMap(Integer a1[], Integer a2[], Integer a3[]) {

		HashSet<Integer> set1 = new HashSet<>(Arrays.asList(a1));
		HashSet<Integer> set2 = new HashSet<>(Arrays.asList(a2));
		HashSet<Integer> set3 = new HashSet<>(Arrays.asList(a3));

		set1.retainAll(set2);
		set1.retainAll(set3);
		System.out.println(set1);
	}

	public static void commonElementUsingHashMap(Integer a1[], Integer a2[], Integer a3[]) {

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < a1.length; i++) {
			if (!(hm.containsKey(a1[i]))) {
				hm.put(a1[i], 1);
			}
		}
		System.out.println(hm);
		for (int i = 0; i < a2.length; i++) {
			if (hm.containsKey(a2[i])) {
				hm.put(a2[i], 2);
			}
		}
		System.out.println(hm);
		for (int i = 0; i < a3.length; i++) {
			if (hm.containsKey(a3[i])) {
				hm.put(a3[i], 3);
			}
		}System.out.println(hm);
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() == 3) {
				System.out.println(hm1.getKey());
			}
		}
	}
}
