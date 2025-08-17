package leetCode;

import java.util.HashMap;
import java.util.Map;

public class FindMissingAndRepeatedValues2965 {

	public static void main(String[] args) {
		int grid[][] = { { 1, 2 }, { 2, 2 } };
		findMissingAndRepeatedValues(grid);
	}

	public static int[] findMissingAndRepeatedValues(int[][] grid) {
		int len = grid.length;
		System.out.println(len);
		int arr[] = new int[2];

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (hm.containsKey(grid[i][j])) {
					hm.put(grid[i][j], hm.get(grid[i][j]) + 1);
				} else {
					hm.put(grid[i][j], 1);
				}
			}
		}
		for (int k = 1; k <= len * len; k++) {
			if (!(hm.containsKey(k)))
				arr[1] = k;
		}
		int count = 0;
		for (Map.Entry<Integer, Integer> hm1 : hm.entrySet()) {
			int value = hm1.getValue();
			if (value > count) {
				count = value;
				arr[0] = hm1.getKey();
			}
		}
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		return arr;
	}
}