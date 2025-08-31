package programs;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		String s = "zzzabcdefgh";
		char charArray[] = s.toCharArray();
		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] < charArray[i + 1]) {
				char temp = charArray[i];
				charArray[i] = charArray[i + 1];
				charArray[i + 1] = temp;
				i=-1;
			}
		}
		System.out.println(Arrays.toString(charArray));
	}
}