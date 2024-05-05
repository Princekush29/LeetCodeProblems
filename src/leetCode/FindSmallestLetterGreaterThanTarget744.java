package leetCode;

public class FindSmallestLetterGreaterThanTarget744 {

	public static void main(String[] args) {
		char letters[] = { 'c', 'f', 'j' };
		char target = 'c';
		System.out.println(nextGreatestLetter(letters, target));
	}

	public static char nextGreatestLetter(char[] letters, char target) {

		int c = target;
		char e = 0;
		for (int i = 0; i < letters.length; i++) {
			int d = letters[i];
			if (c < d) {
				e = letters[i];
				break;
			}
			if (i == letters.length - 1)
				e = letters[0];
		}
		return e;
	}
}