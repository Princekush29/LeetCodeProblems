package leetCode;

import java.util.HashSet;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		String emails[] = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		System.out.println(numUniqueEmails(emails));
	}

	public static int numUniqueEmails(String[] emails) {
		int posOfAtTheRate;
		int posOfPlus;
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < emails.length; i++) {
			posOfAtTheRate = emails[i].indexOf("@");
			posOfPlus = emails[i].indexOf("+");

			String str = emails[i].substring(0, posOfAtTheRate);
			System.out.println(str);
			if (posOfPlus > 0 && posOfAtTheRate > posOfPlus) {
				str = str.substring(0, posOfPlus);
				System.out.println("after post" + str);
			}
			str = str.replace(".", "");
			System.out.println(str);
			str = str + emails[i].substring(posOfAtTheRate);
			set.add(str);
		}
		System.out.println("Set is " + set);
		return set.size();

	}
}
