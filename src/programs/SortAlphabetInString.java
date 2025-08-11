package programs;
import java.util.Arrays;

public class SortAlphabetInString {

	public static void main(String[] args) {
		String s = "zzzabcdefgh";

		// Method1
		System.out.println("Method 1 start");
		char charArray[] = s.toCharArray();
		Arrays.sort(charArray);
		System.out.println(charArray);
		System.out.println(Arrays.toString(charArray));
		System.out.println("Method 1 end");

		// Method2
		System.out.println("Method 2 start");
		String s123 = "asdfg";
		char charArray1[] = s123.toCharArray();
		char temp;
		for (int i = 0; i < charArray1.length; i++) {
			for (int j = i + 1; j < charArray1.length; j++) {
				if (charArray1[i] > charArray1[j]) {
					temp = charArray1[i];
					charArray1[i] = charArray1[j];
					charArray1[j] = temp;
				}
			}
		}
		System.out.println(charArray1);
		System.out.println("Method 2 end");
		
		// Method3
		System.out.println("Method 3 start");
		String s1 = "ACB";
		char arr[] = s1.toCharArray();
		int len = arr.length;
		char temp1;
		for (int j = 0; j < len - 1; j++) {
			if (arr[j] > arr[j + 1]) {
				temp1 = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp1;
				j = -1;
			}
		}
		for (int i = 0; i < len; i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
		System.out.println("Method 3 end");
		
		// Method4 - Not ideal method
		System.out.println("Method 4 start");
		String s11 = "zxcvbnm";
		int arr1[] = new int[s11.length()];
		for (int i = 0; i < s11.length(); i++) {
			char ch = s11.charAt(i);
			int c = ch;
			arr1[i] = c;
		}
		System.out.println(Arrays.toString(arr1));
		int temp111;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = i + 1; j < arr1.length; j++) {
				if (arr1[i] > arr1[j]) {
					temp111 = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp111;
				}
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			char c = (char) arr1[i];
			System.out.print(c);
		}
		System.out.println();
		System.out.println("Method 4 end");
	}
}