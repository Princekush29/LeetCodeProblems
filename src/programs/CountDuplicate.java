package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CountDuplicate {

	public static void main(String[] args) {
		int arr[] = { 10, 20, 25, 30, 25, 25, 35, 40, 40 };
		int size;
		size = arr.length;
		System.out.println(size);

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < size; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}
		System.out.println("Method 1");
		System.out.println(hm);

		// Method 7
		System.out.println(Arrays.asList(hm));

		// Method 8
		System.out.println("Coll"+Collections.singleton(hm));

		System.out.println("Method 2");
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			if (hm1.getValue() > 1)
				System.out.println(hm1.getKey());
		}
		System.out.println("Method 3");
		Iterator<Integer> itr = hm.keySet().iterator();
		Iterator<Integer> itr1 = hm.values().iterator();
		while (itr.hasNext() && itr1.hasNext()) {
			System.out.println(itr.next() + " " + itr1.next());
		}

		System.out.println("Method 4");
		Iterator<Entry<Integer, Integer>> itr3 = hm.entrySet().iterator();

		while (itr3.hasNext()) {
			Entry<Integer, Integer> entry = itr3.next();
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		// For Set - Method 5
		System.out.println("Method 5");
		Set<Integer> s = new HashSet<Integer>();
		s.add(1234);
		Iterator<Integer> itr5 = s.iterator();
		while (itr5.hasNext()) {
			System.out.println(itr5.next());
		}

		// Method 6
		System.out.println("Method 6");
		for (Integer a : s) {
			System.out.println(a);
		}

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		System.out.println("Method 6 for ArrayList");
		for (Integer al1 : al) {
			System.out.println(al1);
		}
		// Method 7
		System.out.println("Method 7 with for loop");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
}