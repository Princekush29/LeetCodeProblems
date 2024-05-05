package leetCode;

public class ReverseWordsInAStringIII557 {

	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}

	public static String reverseWords(String s) {
		String sArray[] = s.split(" ");
		String newStr = "", sentence = "";
		for (int i = 0; i < sArray.length; i++) {
			newStr = "";
			String ss = sArray[i];
			for (int j = ss.length() - 1; j >= 0; j--) {
				newStr = newStr + ss.charAt(j);
			}
			sentence = sentence + newStr +" ";
		}
		return sentence.trim();
	}
}
