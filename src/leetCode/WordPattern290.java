package leetCode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern290 {

	public static void main(String[] args) {
		String pattern = "abba", s = "dog cat cat dog";
		System.out.println(wordPattern(pattern, s));
	}

	public static boolean wordPattern(String pattern, String s) {

		String words[] = s.split(" ");
		if(pattern.length()!=words.length) 
		return false;
		
		Map<Character, String> charToWord = new HashMap<Character, String>();
		Map<String, Character> wordToChar = new HashMap<String, Character>();

		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			String word = words[i];

			if (!charToWord.containsKey(c)) {
				charToWord.put(c, word);
			}
			if (!wordToChar.containsKey(word)) {
				wordToChar.put(word, c);
			}
			if (!charToWord.get(c).equals(word) || !wordToChar.get(word).equals(c)) {
				return false;
			}
		}
		return true;
	}
}
