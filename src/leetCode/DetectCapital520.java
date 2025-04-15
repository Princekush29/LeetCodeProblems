package leetCode;

public class DetectCapital520 {

	public static void main(String[] args) {
		String word = "Leetcode";
		System.out.println(detectCapitalUse(word));
	}

	public static boolean detectCapitalUse(String word) {
		/* Method 1
		 int j = 0, k = 0;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c >= 65 && c <= 90) {
				j++;
				if (i == 0) {
					k++;
				}
			} else if (c >= 97 && c <= 122) {
				k++;
			}
		}
		if (j == word.length() || k == word.length())
			return true;
		else
			return false;*/

		//Method 2
		String a = word.substring(0,1);
		String aa = word.substring(1);
		if(word.equals(word.toUpperCase()) || (word.equals(word.toLowerCase())))
				return true;
		else if(a.equals(a.toUpperCase()) && (aa.equals(aa.toLowerCase())))
			return true;
		return false;
	}
}