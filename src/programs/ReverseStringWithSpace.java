package programs;

public class ReverseStringWithSpace {

	public static void main(String[] args) {
		String s1 = "I Am Not String";
		char arr[] = new char[s1.length()];
		int j = s1.length() - 1;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == ' ') {
				arr[i] = ' ';
			}
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				if (arr[j] == ' ') {
					j--;
				}
				arr[j] = s1.charAt(i);
				j--;
			}
		}
		System.out.println(arr);
	}
}
