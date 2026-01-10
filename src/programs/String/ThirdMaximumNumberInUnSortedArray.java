package programs.String;

public class ThirdMaximumNumberInUnSortedArray {

	// this works with both sorted and unsorted arrays
	// works with positive and negative numbers
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 6 };
		// int[] arr = { 10, 20, 25, 63, 96, 57 };
		// int[] arr = { 10, -20, 25, 63, -96, 57 };
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > firstMax) {
				thirdMax = secondMax;
				secondMax = firstMax;
				firstMax = num;
			} else if (num > secondMax && num < firstMax) {
				thirdMax = secondMax;
				secondMax = num;
			} else if (num > thirdMax && num < secondMax) {
				thirdMax = num;
			}
		}
		System.out.println("First max " + firstMax);
		System.out.println("Second max " + secondMax);
		System.out.println("Third max " + thirdMax);

	}
}
