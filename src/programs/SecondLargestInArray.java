package programs;

public class SecondLargestInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		int n = arr.length;
		int firstLargest = 0;
		int secondLargest = 0;
		
		// Method1
		for (int i = 0; i < n; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			}
		}
		System.out.println("++");
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