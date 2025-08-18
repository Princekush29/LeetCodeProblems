package programs;

import java.util.Arrays;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
		Random random = new Random();
		int arr[] = { 1, 2, 3, 4, 5 };
		int random1 = random.nextInt(arr.length);
		int random2 = random.nextInt(arr.length);
		System.out.println(random1 + " " + random2);
		int temp = arr[random1];
		arr[random1] = arr[random2];
		arr[random2] = temp;

		System.out.println(Arrays.toString(arr));
	}
}