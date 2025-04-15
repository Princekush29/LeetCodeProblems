package leetCode;

public class CheckIfWordOccursAsPrefixAnyWordSentence1455 {

	public static void main(String[] args) {
		String sentence = "dumb dream duck duck i", searchWord = "drea";
		System.out.println(isPrefixOfWord(sentence, searchWord));
	}

	public static int isPrefixOfWord(String sentence, String searchWord) {
		int count = 0;
		String arr[] = sentence.split(" ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < searchWord.length() && arr[i].length() >= searchWord.length(); j++) {
				if (arr[i].charAt(j) == searchWord.charAt(j)) {
					count++;
				} else {
					break;
				}
			}
			if (count == searchWord.length())
				return i + 1;
			count = 0;
		}
		return -1;

	}
}
