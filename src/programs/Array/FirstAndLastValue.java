package programs.Array;

public class FirstAndLastValue {

	public static void main(String[] args) {

		// Method 1
		int arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		int x = 5;
		// o/p - 2, 5
		int first = -1, last = -1;
		for (int i = 0; i < arr.length; i++) {
			if (x != arr[i])
				continue;
			if (first == -1)
				first = i;
			last = i;

		}
		System.out.println(first);
		System.out.println(last);

		// Method2
		int arr2[] = { 1, 3, 4, 4, 4, 4, 67, 123, 125 };
		int x2 = 4;
		// o/p - 2, 5
		int token1 = 0, token2 = 0;
		for (int i = 0, j = arr2.length - 1; i < j; i++, j--) {
			if (x2 == arr2[i] && token1 == 0) {
				System.out.println("First is " + i);
				token1 = 1;
			}
			if (x2 == arr2[j] && token2 == 0) {
				System.out.println("Last is " + j);
				token2 = 1;
			}
		}
	}
}
