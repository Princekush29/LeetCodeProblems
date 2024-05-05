package leetCode;

public class MaxConsecutiveOnes485 {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 0, 1, 1, 1 };
		findMaxConsecutiveOnes(nums);
	}

	public static int findMaxConsecutiveOnes(int[] nums) {
		int newCount = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 1) {
				count++;
			} else
				count = 0;
			if (newCount < count)
				newCount = count;
		}
		return newCount;
	}
}
