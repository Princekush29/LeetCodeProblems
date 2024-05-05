package leetCode;

public class CheckIfBitwiseORHasTrailingZeros2980 {

	public static void main(String[] args) {
		int nums[] = { 1,2,3,4,5};
		System.out.println(hasTrailingZeros(nums));
	}

	public static boolean hasTrailingZeros(int[] nums) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0)
				count++;
			if (count > 1)
				return true;
		}
		return false;
	}
}