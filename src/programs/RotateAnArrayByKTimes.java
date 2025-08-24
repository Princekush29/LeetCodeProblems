package programs;

import java.util.Arrays;

public class RotateAnArrayByKTimes {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; // 7,1,2,3,4,5,6
		int k = 5;// {5,6,7,1,2,3,4}
		int j, count = 0, temp;
		for (int i = 0; count < k;) {
			j = arr.length - 1;
			temp = arr[arr.length - 1];
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
