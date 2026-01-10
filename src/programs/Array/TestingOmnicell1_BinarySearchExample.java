package programs.Array;

public class TestingOmnicell1_BinarySearchExample {
	public static void main(String[] args) {
		// IMPORTANT: The array MUST be sorted
		int[] sortedArray = { 10, 20, 30, 40, 50 };
		int target = 40;

		int result = binarySearch(sortedArray, target);

		if (result == -1) {
			System.out.println("Element not present");
		} else {
			System.out.println("Element found at index: " + result);
		}
	}

	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			// Calculate the middle index
			int mid = low + (high - low) / 2;

			// Check if target is at mid
			if (arr[mid] == target) {
				return mid; // Target found
			}

			// If target is greater, ignore the left half
			if (arr[mid] < target) {
				low = mid + 1;
			}
			// If target is smaller, ignore the right half
			else {
				high = mid - 1;
			}
		}

		return -1; // Target not found
	}
}