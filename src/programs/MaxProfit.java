package programs;

public class MaxProfit  {
	public static void main(String[] args) {

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
	}
}