package programs;

public class TestingOmnicell {

	public static void main(String[] args) {
		int nums[] = { -2, 1 };
		maxSubArray(nums);
	}

	public static int maxSubArray(int nums[]) {

		if (nums.length == 1)
			return nums[0];
		int sum = 0, token = 1, newSum = Integer.MIN_VALUE, a = 0;
		for (int i = 0, j = i + 1; j < nums.length; j++) {
			a = nums[i];// -2
			if (token == 1) {
				sum = a + nums[j];
				token = 2;
			} else {
				sum = sum + nums[j];
			}

			if (sum > newSum)
				newSum = sum;
			if (newSum < nums[i])
				newSum = nums[i];
			if (j == nums.length - 1) {
				i++;
				token = 1;
				j = i;
			}

		}
		if (newSum < nums[nums.length - 1])
			newSum = nums[nums.length - 1];
		System.out.println(newSum);
		return newSum;
	}
}