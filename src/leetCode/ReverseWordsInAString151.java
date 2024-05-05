package leetCode;

public class ReverseWordsInAString151 {

	public static void main(String[] args) {
		String s = "  a good   example  ";
		s = s.trim();
		String arr[] = s.split(" ");
		String newStr = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			if (arr[i].length() > 0) {
				if (i == 0) {
					newStr = newStr + arr[i];
				} else {
					newStr = newStr + arr[i] + " ";
				}
			}
		}
		System.out.println(newStr);
	}
}
