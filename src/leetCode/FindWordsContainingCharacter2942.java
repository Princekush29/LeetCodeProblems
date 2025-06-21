package leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter2942 {

	public static void main(String[] args) {
		String word[] = { "abc", "bcd", "aaaa", "cbc" };
		char x = 'a';
		findWordsContaining(word, x);
	}

	public static List<Integer> findWordsContaining(String[] words, char x) {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < words.length; i++) {
			String s = words[i];
			String a = x + "";
			if (s.contains(a)) {
				list.add(i);
			}
		}
		System.out.println(list);
		return list;
	}
}