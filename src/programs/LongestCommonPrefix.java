package programs;
import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		
		String input[] = { "flower", "fly", "flow" };
		
		Arrays.sort(input);
		int length = input.length;
		String newStr="";
		int end = Math.min(input[0].length(), input[length-1].length());
		int i=0;
		while(i<end && input[0].charAt(i) == input[length-1].charAt(i)) {
			newStr = newStr+input[0].charAt(i);
			i++;
		}
		System.out.println(newStr);
	}
}
