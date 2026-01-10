package programs.Array;

public class TestingEY {
	public static void main(String[] args) {
		// List - 10,35,15,12 --> 72 -->9
		int arr[] = { 10, 35, 15, 12 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
		int a = sum;
		int reminder, newSum = 0;

		while (a != 0) {
			reminder = a % 10; // 7
			newSum = newSum + reminder;// 0+2
			a = a / 10; // a=7

			if (a == 0 && newSum > 9) {
				a = newSum;
				newSum = 0;
			}
		}
		System.out.println(newSum);
	}
}