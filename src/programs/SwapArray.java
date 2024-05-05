package programs;
import java.util.Arrays;

public class SwapArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5, 4 };

		int temp = 0;
		int j = a.length - 1;

		for (int i = 0; i < a.length / 2; i++) {
			temp = a[i];
			a[i] = a[j - i];
			a[j - i] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println(Arrays.toString(a));
	}
}