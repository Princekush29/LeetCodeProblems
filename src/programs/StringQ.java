package programs;

import java.util.Arrays;

public class StringQ {

	public static void main(String[] args) {
		String s1 = "!A@B#C$D";
		// Output string = !D@C#B$A
		
		// Method1
		String newStr = "", newSymbol = "", newString = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if (ch >= 65 && ch <= 90) {
				newStr = newStr + ch;
			} else {
				newSymbol = newSymbol + ch;
			}
		}
		System.out.println(newStr);
		System.out.println(newSymbol);
		for (int i = newStr.length() - 1, j = 0; i >= 0 && j < newSymbol.length(); i--, j++) {
			newString = newString + newSymbol.charAt(j);
			newString = newString + newStr.charAt(i);
		}
		System.out.println(newString);
		System.out.println("+++");

		// Method 2
		char arr[] = s1.toCharArray();
		char temp;
		System.out.println(Arrays.toString(arr));
		for (int i = 0, j = arr.length - 1; i < j;) {
			char c = arr[i];
			char d = arr[j];

			if (!(c >= 65 && c <= 90))
				i++;
			if (!(d >= 65 && d <= 90))
				j--;
			if ((c >= 65 && c <= 90) && (d >= 65 && d <= 90)) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		System.out.println("Output is " + Arrays.toString(arr));
	}
}