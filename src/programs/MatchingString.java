package programs;

public class MatchingString {
	public static void main(String[] args) {
		String s1 = "abcdef";
		String s2 = "efabcd";
		// Method1
		String s3 = s1 + s1;
		if (s3.contains(s2)) {
			System.out.println("Matching");
		} else {
			System.out.println("Not Matching");
		}

		// Method2
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == s2.charAt(0)) {
				if (s1.substring(i).equals(s2.substring(0, s1.length() - i))) {
					//System.out.println(s1.substring(i));
					//System.out.println(s2.substring(0, s1.length() - i));
					if (s1.substring(0, i).equals(s2.substring(s1.length() - i))) {
						//System.out.println(s1.substring(0, i));
						//System.out.println(s2.substring(s1.length() - i));
						System.out.println("Contains");
					} else {
						System.out.println("NOT CONTAINS");
					}
				}else {
					System.out.println("Not Contains");
				}
			}
		}
	}
}