package leetCode;

import java.util.Arrays;

public class CheckAllTheIntegersRangeAreCovered1893 {

	public static void main(String[] args) {

		 int ranges[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		//int ranges[][] = { { 1, 50 } };
		int left = 2, right = 5;
		System.out.println(isCovered(ranges, left, right));
	}

	public static boolean isCovered(int[][] ranges, int left, int right) {
		System.out.println("Ranges row length" + ranges.length);
		System.out.println("Ranges column length" + ranges[0].length);
		int arr[] = new int[(ranges.length) * (ranges[0].length)];
		System.out.println("Length is " + arr.length);
		int k = 0;
		for (int i = 0; i < ranges.length; i++) {
			for (int j = 0; j < ranges[i].length; j++) {
				arr[k] = ranges[i][j];
				k++;
			}
		}

		System.out.println(Arrays.toString(arr));

		if (left >= arr[0] && right <= arr[arr.length - 1])
			return true;
		return false;

		/*
		 * int starting = ranges[0][0]; System.out.println("Starting " + starting); int
		 * ending = ranges[ranges.length - 1][ranges[0].length - 1];
		 * System.out.println("Ending " + ending);
		 * 
		 * if (left > starting && right < ending) return true; return false;
		 */
	}
}