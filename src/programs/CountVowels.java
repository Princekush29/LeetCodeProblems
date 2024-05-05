package programs;
import java.util.ArrayList;

public class CountVowels {

	public static void main(String[] args) {
		String str = "aabbccddee";
		String vowels = "aeiou";
		int count = 0;

		ArrayList<Character> al = new ArrayList<Character>();

		for (int i = 0; i < vowels.length(); i++) {
			al.add(vowels.charAt(i));
		}

		// Count Vowels
		for (int i = 0; i < str.length(); i++) {
			if (al.contains(str.charAt(i)))
				count++;
		}
		System.out.println(count);
		// Remove vowels from String
		for (int i = 0; i < str.length(); i++) {
			if (!(al.contains(str.charAt(i))))
				System.out.print(str.charAt(i));
		}
	}
}