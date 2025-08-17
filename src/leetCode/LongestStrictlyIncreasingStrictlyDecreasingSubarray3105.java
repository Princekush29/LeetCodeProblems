package leetCode;

public class LongestStrictlyIncreasingStrictlyDecreasingSubarray3105 {

	public static void main(String[] args) {
		int nums[] = { 1, 2 };
		System.out.println(longestMonotonicSubarray(nums));
	}

	public static int longestMonotonicSubarray(int[] nums) {

		int count = 1, newCount = 1;
		int count1 = 1, newCount1 = 1;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				count++;
			} else {
				count = 1;
			}
			if (newCount < count) {
				newCount = count;
			}
		}
		for (int i = 0; i < nums.length - 1; i++) {

			if (nums[i] < nums[i + 1]) {
				count1++;
			} else {
				count1 = 1;
			}
			if (newCount1 < count1) {
				newCount1 = count1;
			}
		}
		if (newCount > newCount1)
			return newCount;
		return newCount1;
	}
}