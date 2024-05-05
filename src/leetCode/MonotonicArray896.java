package leetCode;

public class MonotonicArray896 {

	public static void main(String[] args) {
		int nums[] = { 1, 1, 1 };
		System.out.println(isMonotonic(nums));
	}

	public static boolean isMonotonic(int[] nums) {
		int j;
		for (j = 0; j < nums.length - 1; j++) {
			if (nums[j] == nums[j + 1])
				continue;
			else
				break;
		}
		if (j == nums.length - 1)
			return true;
		if (nums[j] < nums[j + 1]) {
			for (int i = j; i < nums.length - 1; i++) {
				if (nums[i] <= nums[i + 1]) {

				} else {
					return false;
				}
			}
		} else if (nums[j] > nums[j + 1]) {
			for (int i = j; i < nums.length - 1; i++) {
				if (nums[i] >= nums[i + 1]) {

				} else {
					return false;
				}
			}

		}
		return true;
	}
}