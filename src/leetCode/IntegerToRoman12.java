package leetCode;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman12 {

	public static void main(String[] args) {
		int num = 12;

		intToRoman(num);
	}

	public static String intToRoman(int num) {
		Character roman;
		Map<Integer, Character> hm = new HashMap<Integer, Character>();

		hm.put(1, 'I');
		hm.put(5, 'V');
		hm.put(10, 'X');
		hm.put(50, 'L');
		hm.put(100, 'C');
		hm.put(500, 'D');
		hm.put(1000, 'M');

		int first_digit = num;
		while (first_digit >= 10)
			first_digit /= 10;

		System.out.println(first_digit);
		roman = hm.get(first_digit);
		System.out.println(roman);

		return "a";
	}
}
