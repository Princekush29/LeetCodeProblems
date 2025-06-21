package leetCode;

public class JumpGame55 {

	public static void main(String[] args) {

		int nums[] = { 2, 0, 0 };
		System.out.println(canJump(nums));
	}

	public static boolean canJump(int[] nums) {
		int len = nums.length;
		int goal = nums.length - 1;
		// System.out.println(len);
		for (int i = nums.length - 2; i >= 0; i--) {
			if (i + nums[i] >= goal)
				goal = i;
		}

		return goal == 0;
	}
}