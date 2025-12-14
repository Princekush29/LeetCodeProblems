package leetCode;

public class TruncateSentence1816 {

	public static void main(String[] args) {
		String s = "chopper is not a tanuki";
		int k = 5;

		System.out.println(truncateSentence(s, k));
	}

	public static String truncateSentence(String s, int k) {
		// Method 0
		/*
		 * String arr[]=s.split(" "); String newStr1=""; for(int i=0;i<k;i++) {
		 * newStr1=newStr1+arr[i] +" "; } return newStr1.trim();
		 */

		// Method1
		int count = 0;
		String newStr = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				count++;
			if (count < k)
				newStr = newStr + s.charAt(i);
		}

		// Method2
		StringBuilder sb = new StringBuilder();
		String arr2[] = s.split(" ");
		for (int i = 0; i < k; i++) {
			sb = sb.append(arr2[i]);
			sb = sb.append(" ");
		}

		return sb.toString().trim();
	}
}
