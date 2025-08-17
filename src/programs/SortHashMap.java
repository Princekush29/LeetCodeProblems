package programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SortHashMap {

	public static void main(String[] args) {
		Map<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Apple", 40);
		hm.put("Banana", 10);
		hm.put("Cherry", 30);
		hm.put("Date", 20);

		System.out.println(hm);
		Map<String, Integer> tm = new TreeMap<String, Integer>(hm);
		System.out.println(tm);

		List<Map.Entry<String, Integer>> entry = new ArrayList(hm.entrySet());

		Collections.sort(entry, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
				return e1.getValue().compareTo(e2.getValue());// ascending
			}
		});
		System.out.println(entry);

	}
}
