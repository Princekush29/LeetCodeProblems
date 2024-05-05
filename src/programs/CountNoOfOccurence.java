package programs;

public class CountNoOfOccurence {

	public static void main(String[] args) {

		/*
		 * Input: arr[] = {1, 1, 2, 2, 2, 2, 3,}, x = 2 Output: 4 // x (or 2) occurs 4
		 * times in arr[]
		 */
		int arr[] = { 1, 1, 2, 2, 2, 2, 3, }, x = 2, count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == x)
				count++;
		}
		System.out.println(count);
	}
}
