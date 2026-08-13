package pq;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringQ {

	public static void main(String[] args) {

		findNumbers("1234");
		findNumbers("123 abc");
		findNumbers("abc 456");
		findNumbers("a12b34");
	}

	public static void findNumbers(String input) {

		String regex = "\\d+";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			System.out.print(matcher.group() + " ");
		}

		System.out.println();
	}
}

/*
 * \\d+ means one or more digits, and matcher.find() searches for each matching
 * number in the String. matcher.group() returns the number that was found. We
 * put this logic in a separate method so we can reuse the same code for
 * different Strings.
 * 
 * 
 */