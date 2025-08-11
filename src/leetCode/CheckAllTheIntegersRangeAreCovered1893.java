package leetCode;

import java.util.ArrayList;

public class CheckAllTheIntegersRangeAreCovered1893 {

	public static void main(String[] args) {

		//int ranges[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int ranges[][] = { { 1, 50 } };
		int left = 1, right = 50;
		System.out.println(isCovered(ranges, left, right));
	}

	public static boolean isCovered(int[][] ranges, int left, int right) {
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < ranges.length; i++) {
			for (int j = 0; j < 1; j++) {
				int a = ranges[i][j];
				int b = ranges[i][j+1];
			
				for(int k=a;k<=b;k++) {
					System.out.println(k);
					al.add(k);
				}
			}
		}

		for (int i = left; i <= right; i++) {
			if (!al.contains(i))
				return false;
		}
		return true;
	}
}
