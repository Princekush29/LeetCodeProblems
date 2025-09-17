package programs;

import java.util.Arrays;

public class RotateAnArrayByKTimes {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // 7,1,2,3,4,5,6
		int k = 3;// {5,6,7,1,2,3,4}
		int count = 0;

		for (int i = 0; count < k;) {
			int j = arr.length - 1;
			int temp = arr[arr.length - 1];
			while (j != i) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[0] = temp;
			count++;
		}
		System.out.println(Arrays.toString(arr));
	}
}