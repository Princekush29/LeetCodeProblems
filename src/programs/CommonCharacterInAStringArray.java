package programs;

import java.util.Arrays;

public class CommonCharacterInAStringArray {

	public static void main(String[] args) {

		String[] input = { "flower", "flow", "flight" };
		// Output- common prefix - fl
		commonCharacter(input);
	}

	public static void commonCharacter(String[] input) {

		Arrays.sort(input);

		System.out.println(Arrays.toString(input));
		int max = Math.max(input[0].length(), input[input.length - 1].length());
		int i = 0;
		String str = "";
		System.out.println("Max is " + max);
		while (max > i && input[0].charAt(i) == input[input.length - 1].charAt(i)) {
			i++;
		}
		System.out.println(input[0].substring(0, i));
	}
}