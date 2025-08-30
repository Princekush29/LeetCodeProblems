package programs;

public class TestingOmnicell {

	public static void main(String[] args) {
		int nums[] = { -2, 1, 3, 4, -9 };
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int nums[]) {

		if (nums.length == 1)
			return nums[0];
		int sum = 0;
		int newSum = 0;
		int token = 1, a = 0;
		for (int i = 0, j = i + 1; j < nums.length; j++) {
			a = nums[i];
			if (token == 1) {
				sum = a + nums[j];
				token = 2;
			} else {
				sum = sum + nums[j];
			}
			if (sum > newSum)
				newSum = sum;

			if (j == nums.length - 1) {
				i++;
				token = 1;
				j = i;
			}
		}
		return newSum;
	}
}