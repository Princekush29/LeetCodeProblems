package leetCode;

public class SignOfTheProductOfAnArray1822 {

	public static void main(String[] args) {
		int nums[] = { -1, -2, -3, -4, 3, 2, 1 };
		System.out.println(arraySign(nums));
	}

	public static int arraySign(int[] nums) {
		int product = 1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				product = product * 1;
			else if (nums[i] < 0)
				product = product * -1;
			else if (nums[i] == 0)
				return 0;
		}
		return product;
	}
}
