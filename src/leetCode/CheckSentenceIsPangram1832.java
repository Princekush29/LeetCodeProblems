package leetCode;

import java.util.HashMap;

public class CheckSentenceIsPangram1832 {

	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		System.out.println(checkIfPangram(sentence));
	}

	public static boolean checkIfPangram(String sentence) {

		if (sentence.length() < 25)
			return false;
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < sentence.length(); i++) {
			char ch = sentence.charAt(i);
			hm.put(ch, 1);
		}
		System.out.println(hm);

		for (int i = 0; i < 26; i++) {
			char ch = (char) 'a' + 1;
			if (!hm.containsKey(ch))
				return false;
		}
		return true;
	}
}
