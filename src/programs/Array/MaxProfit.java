package programs.Array;

public class MaxProfit {
	public static void main(String[] args) {

		// Method 1
		int arr[] = { 7, 1, 5, 3, 6, 4 };
		int a = Integer.MAX_VALUE;
		int value = 0, profit = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < a) {
				a = arr[i];
			}
			value = arr[i] - a;
			if (profit < value)
				profit = value;
		}
		System.out.println(profit);

		// Method 2 - Easy way
		int arr1[] = { 7, 1, 5, 3, 6, 4 };
		int profit1 = 0, newProfit1 = 0;
		for (int i = 0, j = i + 1; i < arr1.length - 1; j++) {
			if (arr1[j] > arr1[i])
				profit1 = arr1[j] - arr1[i];
			if (profit1 > newProfit1) {
				newProfit1 = profit1;
			}
			if (j == arr1.length - 1) {
				i++;
				j = i;
			}
		}
		System.out.println(newProfit1);
	}
}
