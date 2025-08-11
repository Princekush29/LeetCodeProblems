package programs;

import java.util.*;

public class SortMap {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 40);
		map.put("Banana", 10);
		map.put("Cherry", 30);
		map.put("Date", 20);

		// sort using values
		// Map<String, Integer> tm = new TreeMap<String, Integer>(hm);
		// System.out.println(tm);

		// Step 1: Convert map to list of entries
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

		// Step 2: Sort the list by values
		Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
				return e1.getValue().compareTo(e2.getValue()); // ascending
				// return e2.getValue().compareTo(e1.getValue()); // descending

			}
		});

	}
}
