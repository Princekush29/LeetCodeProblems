package leetCode;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class MinimumIndexSumOfTwoLists599 {

	public static void main(String[] args) {

		String list1[] = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String list2[] = { "KFC", "Shogun", "Burger King" };
		System.out.println(findRestaurant(list1, list2));
	}

	public static String[] findRestaurant(String[] list1, String[] list2) {
		LinkedHashMap<String, Integer> map1 = new LinkedHashMap<>();
		LinkedHashMap<String, Integer> map2 = new LinkedHashMap<>();
		List<String> val = new ArrayList<>();

		int minIndexSum = Integer.MAX_VALUE;
		for (int i = 0; i < list1.length; i++) {
			map1.put(list1[i], i);
		}
		for (int j = 0; j < list2.length; j++) {
			map2.put(list2[j], 1);
			if (map1.containsKey(list2[j])) {
				int currentIndexSum = j + map1.get(list2[j]);
				if (currentIndexSum < minIndexSum) {
					minIndexSum = currentIndexSum;
					val.clear();
					val.add(list2[j]);
				} else if (currentIndexSum == minIndexSum) {
					val.add(list2[j]);
				}
			}
		}
		System.out.println(val);
		return val.toArray(new String[0]);

	}
}