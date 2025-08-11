package leetCode;

import java.util.HashSet;

public class UniqueEmailAddresses929 {

	public static void main(String[] args) {
		String emails[] = { "test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com",
				"testemail+david@lee.tcode.com" };
		System.out.println(numUniqueEmails(emails));
	}

	public static int numUniqueEmails(String[] emails) {
		int posOfAtTheRate = 0;
		String s = "";
		String ss = "";
		HashSet<String> hs = new HashSet<String>();
		for (int i = 0; i < emails.length; i++) {
			posOfAtTheRate = emails[i].indexOf("@");
			int posOfPlus = emails[i].indexOf("+");
			String str = emails[i];
			s = str.substring(0, posOfAtTheRate);

			if (posOfPlus > 0 && posOfAtTheRate > posOfPlus) {
				s = s.substring(0, posOfPlus);
			}
			s = s.replace(".", "");
			ss = s + str.substring(posOfAtTheRate);
			hs.add(ss);
		}
		return hs.size();
	}
}
