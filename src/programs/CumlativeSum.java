package programs;

import java.util.Arrays;

public class CumlativeSum {

	public static void main(String[] args) {
		// Input → [1,2,3,4] Output → [1,3,6,10] (cumulative sum)
		int arr[] = { 1, 2, 3, 4 };
		
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+arr[i];
			arr[i]= sum;
		}
		System.out.println(Arrays.toString(arr));
	}
}
