package programs.Array;

public class SubArrayWithSum {

	public static void main(String[] args) {
		test();
		bruteForceMethod();
	}

	/*
	 * Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33 Output: Sum found between
	 * indexes 2 and 4 Explanation: Sum of elements between indices 2 and 4 is 20 +
	 * 3 + 10 = 33
	 */
	public static void test() {
		int arr[] = { 1, 4, 20, 3, 10, 5 }; //sum==33
		int sum = 33, newSum = 0, flag = 1;
		for (int i = 0, j = i + 1; j < arr.length; j++) {
			int a = arr[i];
			if (flag == 1) {
				newSum = newSum + a;
				newSum = newSum + arr[j];
				flag = 2;
			} else {
				newSum = newSum + arr[j];
			}
			if (sum == newSum) {
				System.out.println(i);
				System.out.println(j);
				break;
			}
			if (j == arr.length - 1 || newSum > sum) {
				flag = 1;
				i = i + 1;
				j = i;
				newSum = 0;
			}
		}
	}

	public static void bruteForceMethod() {
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
