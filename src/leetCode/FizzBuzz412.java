package leetCode;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz412 {

	public static void main(String[] args) {
		int n = 3;
		System.out.println(fizzBuzz(n));
	}

	public static List<String> fizzBuzz(int n) {
		List<String> list = new LinkedList<String>();

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				list.add("FizzBuzz");
			else if (i % 3 == 0)
				list.add("Fizz");
			else if (i % 5 == 0)
				list.add("Buzz");
			else
				list.add(String.valueOf(i));
			// list.add(i + "");
		}
		return list;

	}
}
