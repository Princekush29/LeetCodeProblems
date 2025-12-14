package leetCode;

import java.util.ArrayList;

public class GoatLatin824 {

	public static void main(String[] args) {
		String sentence = "The quick brown fox jumped over the lazy dog";
		// Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
		System.out.println(toGoatLatin(sentence));
	}

	public static String toGoatLatin(String sentence) {
		// Method 1
		// sentence.replaceAll("[aeiouAEIOU]", "");
		String newStr = "";
		String vowels = "aeiouAEIOU";
		ArrayList<Character> al = new ArrayList<Character>();
		for (int i = 0; i < vowels.length(); i++) {
			al.add(vowels.charAt(i));
		}
		String arr[] = sentence.split(" ");
		String a = "";
		for (int i = 0; i < arr.length; i++) {
			a = a + "a";
			if (al.contains(arr[i].charAt(0))) {
				newStr = newStr + arr[i] + "ma" + a + " ";
			} else {
				newStr = newStr + arr[i].substring(1, arr[i].length()) + arr[i].charAt(0) + "ma" + a + " ";
			}
		}
		return newStr.trim();

	}
}
