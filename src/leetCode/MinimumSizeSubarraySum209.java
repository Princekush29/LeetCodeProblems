package leetCode;

public class MinimumSizeSubarraySum209 {

	public static void main(String[] args) {
		int target = 7;
		int nums[] = { 2, 3, 1, 2, 4, 3 };
		System.out.println(minSubArrayLen(target, nums));
	}

	public static int minSubArrayLen(int target, int[] nums) {
		int i, size = 0;
		for (i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					size = 2;
				}
			}
		}
		return size;
	}
}