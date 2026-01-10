package programs.String;

import java.util.Arrays;

public class ReverseOnlyAlphabet {

	public static void main(String[] args) {
		// input - {s, t, k, $, r, #, 0}
		// output -{r,k,t,$,s,#,0}
		char arr[] = { 's', 't', 'k', '$', 'r', '#', '0' };
		char temp;
		for (int i = 0, j = arr.length - 1; i < j;) {
			if (!(arr[i] >= 96 && arr[i] < 122)) {
				i++;
			} else if (!(arr[j] >= 96 && arr[j] < 122)) {
				j--;
			} else if ((arr[i] >= 97 && arr[i] <= 122) && (arr[j] >= 97 && arr[j] <= 122) && (i < j)) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
