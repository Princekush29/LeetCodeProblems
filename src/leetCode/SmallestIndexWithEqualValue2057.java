package leetCode;

public class SmallestIndexWithEqualValue2057 {

	public static void main(String[] args) {
		int nums[] = { 0, 1, 2 };
		System.out.println(smallestEqual(nums));
	}

	public static int smallestEqual(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 10 == i)
				return i;
		}
		return -1;

	}
}
