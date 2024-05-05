package programs;

public class ContainsDuplicate {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 4, 5 };
		int count = 0;

		// Method 1
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count = 1;
				}
			}
		}
		if (count == 1)
			System.out.println("Contains Duplicate");
		else
			System.out.println("Don't contain Duplicate");
	}
}