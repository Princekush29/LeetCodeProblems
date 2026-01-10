package programs.String;

public class ThirdMinimumNumberInUnSortedArray {

	// works with both sorted and unsorted arrays
	// works with positive and negative numbers
	public static void main(String[] args) {
		// int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7, 7, 6 };
		// int[] arr = { 10, 20, 25, 63, 96, 57 };
		// int[] arr = { 10, -20, 25, 63, -96, 57 };
		int[] arr = { 11, 21, 17, 15, 35, 32, 22, 21};
		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		int thirdMin = Integer.MAX_VALUE;

		for (int num : arr) {
			if (num < firstMin) {
				thirdMin = secondMin;
				secondMin = firstMin;
				firstMin = num;
			} else if (num < secondMin && num > firstMin) {
				thirdMin = secondMin;
				secondMin = num;
			} else if (num < thirdMin && num > secondMin) {
				thirdMin = num;
			}
		}
		System.out.println("First min " + firstMin);
		System.out.println("Second min " + secondMin);
		System.out.println("Third min " + thirdMin);

	}

}
