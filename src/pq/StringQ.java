package pq;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringQ {

	public static void main(String[] args) {
		String regex = "\\d+";
		String input = "1234";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);

		while (matcher.find()) {
			System.out.print(matcher.group() + " ");
		}
	}

}
