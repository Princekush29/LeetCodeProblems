package programs;
import java.util.Arrays;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		String input[] = {"flower", "flow", "fly"};
		
		//Output = fl;
		System.out.println(solution1(input));
	}
	public static String solution1(String input[]) {
		if(input.length==0)
		return "";
		
		if(input.length==1)
			return input[0];
		
		Arrays.sort(input);
		
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
		
		int end = Math.min(input[0].length(), input[input.length-1].length());
		System.out.println(end);
		int i=0;
		while(i<end &&input[0].charAt(i)==input[input.length-1].charAt(i))
		 i++;
		
		String pre = input[0].substring(0,i);
		return pre;
		
	}
}
