package leetCode;

import java.util.Arrays;

public class RelativeRanks506 {

	public static void main(String[] args) {
		int score[] = { 10, 3, 8, 9, 4 };
		findRelativeRanks(score);
	}

	public static String[] findRelativeRanks(int[] score) {
		String str[] = new String[score.length];
		int arr[] = new int[score.length];
		int newArray[] = score.clone();
		Arrays.sort(newArray);

		int j = 0;
		for (int i = newArray.length - 1; i >= 0; i--) {
			arr[i] = newArray[j];
			j++;
		}

		System.out.println("arr" + Arrays.toString(arr));// [10, 9, 8, 4, 3]
		System.out.println("score" + Arrays.toString(score));// [10, 3, 8, 9, 4]
		int count = 1;
		int rank = 4;
		for (int i = 0; i < score.length; i++) {
			for (int k = 0; k < arr.length; k++) {
				if (arr[i] == score[k] && count == 1) {
					str[k] = "Gold Medal";
					count++;
					break;
				}
				if (arr[i] == score[k] && count == 2) {
					str[k] = "Silver Medal";
					count++;
					break;
				}
				if (arr[i] == score[k] && count == 3) {
					str[k] = "Bronze Medal";
					count++;
					break;
				} else if (i > 2 && arr[i] == score[k]) {
					str[k] = Integer.toString(rank);
					rank++;
					break;
				}

			}
		}
		System.out.println(Arrays.toString(str));
		return str;
	}
}