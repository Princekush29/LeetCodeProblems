package leetCode;

public class MaximumNumberOfWordsYouCanType1935 {

	public static void main(String[] args) {
		String text = "abc de", brokenLetters = "";
		System.out.println(canBeTypedWords(text, brokenLetters));
	}

	public static int canBeTypedWords(String text, String brokenLetters) {
		int count = 0;
		String words[] = text.split(" ");
		char[] c = brokenLetters.toCharArray();
		System.out.println("C length is " + c.length);
		if(brokenLetters.length()==0)
			return words.length;
		for (int i = 0; i < words.length; i++) {
			String d = words[i];
			for (int j = 0; j < c.length; j++) {
				int a = words[i].indexOf(c[j]);
				if (a >= 0)
					break;
				if (j == c.length - 1)
					count++;
			}
		}
		return count;
	}
}
