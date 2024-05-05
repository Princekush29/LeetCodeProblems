package leetCode;

import java.util.HashSet;
import java.util.Set;

public class NumberDifferentIntegersString1805 {

	public static void main(String[] args) {
		String word = "sh8s0";
		System.out.println(numDifferentIntegers(word));
	}

	public static int numDifferentIntegers(String word) {
		if (word.length() == 1 && word.charAt(0) > 47 && word.charAt(0) < 58)
			return 1;
		if (word.matches("[0-9]+") && word.length() > 1)
			return 1;

		int number = 0;
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (c > 47 && c < 58) {
				int a = Character.getNumericValue(c);
				if (number > 2147483647) {
					number = 1;
				} else
					number = Math.abs((number * 10)) + a;
			} else {
				if (number > 0)
					set.add(number);
				// char e = word.charAt(i - 1);

				if (i > 0 && number == 0 && word.charAt(i - 1) == '0')
					set.add(number);
				number = 0;
			}
		}
		if (number > 0 ||(number==0 && word.charAt(word.length()-1)=='0'))
			set.add(number);
		System.out.println(set);
		return set.size();
	}
}