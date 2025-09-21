package programs;

public class CountMaximumConsecutiveOfAnyNumber {

	public static void main(String[] args) {
		int[] input = { 1, 1, 2, 3, 1, 1, 1, 6, 1, 1, 1, 1, 1, 1 };

		int maxCount = 1;
		int currentCount = 1;
		int maxElement = input[0];

		for (int i = 1; i < input.length; i++) {
			if (input[i] == input[i - 1]) {
				currentCount++;
			} else {
				currentCount = 1;
			}

			if (currentCount > maxCount) {
				maxCount = currentCount;
				maxElement = input[i];
			}
		}

		System.out.println("Element with max consecutive occurrence: " + maxElement);
		System.out.println("Max consecutive count: " + maxCount);
	}
}
