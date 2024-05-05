package leetCode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf238 {

	public static void main(String[] args) {
		int nums[] = { -1, 1, 0, -3, 3 };
		System.out.println(productExceptSelf(nums));

	}

	public static int[] productExceptSelf(int[] nums) {
		int arr[] = new int[nums.length];
		int product = 1;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (i != j) {
					product = product * nums[j];
				}
			}
			arr[i] = product;
			product = 1;
		}
		System.out.println(Arrays.toString(arr));
		return nums;
	}
}