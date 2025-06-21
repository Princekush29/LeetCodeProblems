package programs;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int arr[] = { 5, 3, 4, 4 };
		int n = arr.length;
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		// Method1
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			}
			if (arr[i] < secondLargest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("++");
		System.out.println(largest);
		System.out.println(secondLargest);

		// Method2
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(arr[arr.length - 2]);
	}
}