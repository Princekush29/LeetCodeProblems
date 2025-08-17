package programs;

public class SubArrayWithSum {

	public static void main(String[] args) {
		/*
		 * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33 Output: Sum found between
		 * indexes 2 and 4 Explanation: Sum of elements between indices 2 and 4 is 20 +
		 * 3 + 10 = 33
		 */

		int arr[] = { 1, 4, 20, 3, 10, 5 }, sum = 33, currentSum = 0;

		for (int i = 0; i < arr.length; i++) {
			currentSum = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				currentSum += arr[j];
				if (currentSum == sum) {
					System.out.println(i + " " + j);
				}
			}
		}
	}
}