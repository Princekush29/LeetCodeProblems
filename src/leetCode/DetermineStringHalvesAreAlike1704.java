package leetCode;

import java.util.ArrayList;

public class DetermineStringHalvesAreAlike1704 {

	public static void main(String[] args) {
		String s = "textbook";
		System.out.println(halvesAreAlike(s));
	}

	public static boolean halvesAreAlike(String s) {
		String vowels = "aeiouAEIOU";
		ArrayList<Character> al = new ArrayList<Character>();
		for (int i = 0; i < vowels.length(); i++) {
			al.add(vowels.charAt(i));
		}
		System.out.println("Length is "+s.length());
		int count1 = 0, count2 = 0;
		for (int i = 0, j = s.length()-1; i < s.length() / 2 && i<j; i++, j--) {
			if (al.contains(s.charAt(i)))
				count1++;
			if (al.contains(s.charAt(j)))
				count2++;
		}
		return count1 == count2;

	}
}
