package leetCode;

public class RemoveOneElementMakeTheArrayStrictlyIncreasing1909 {

	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		System.out.println(canBeIncreasing(nums));
	}

	public static boolean canBeIncreasing(int[] nums) {
		int count = 0;
		System.out.println(nums.length);
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > nums[i + 1]) {
				count++;
				if (nums[i - 1] > nums[i + 1])
					return false;
			}
			
		}
		System.out.println(count);
		if (count == 1)
			return true;
		if (count == 0)
			return true;
		return false;

	}
}
